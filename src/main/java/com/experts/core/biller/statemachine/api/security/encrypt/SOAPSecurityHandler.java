package com.experts.core.biller.statemachine.api.security.encrypt;


import org.apache.commons.net.util.Base64;
import org.springframework.stereotype.Component;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.ws.soap.SOAPFaultException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;

/*import org.jcp.xml.dsig.internal.dom.DOMUtils;*/

@Component("soapSecurityHandler")
public class SOAPSecurityHandler implements SOAPHandler<SOAPMessageContext> {

    private static final String KEYSTORE_FILE = "biller_core_keystore.jks";
    private static final String KEYSTORE_INSTANCE = "JKS";
    private static final String KEYSTORE_PWD = "opc@2018";
    private static final String KEYSTORE_ALIAS = "mykey";
    private static final String jksPath = "C:/jks/biller_core_keystore.jks" , jksPassword = "opc@2018";
    private static final String keystoreFile = "biller_core_keystore.jks";
    private static final String keyStorePassword = "opc@2018";
    private static final String alias = "mykey";
    private CertificateDetails certDetails = null;

    @Override
    public boolean handleMessage(SOAPMessageContext context) {

        System.out.println("Server : handleMessage()......");

        Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        //for response message only, true for outbound messages, false for inbound
        if(!isRequest){

            try{
                SOAPMessage soapMsg = context.getMessage();
                SOAPEnvelope soapEnv = soapMsg.getSOAPPart().getEnvelope();
                SOAPHeader soapHeader = soapEnv.getHeader();

                //if no header, add one
                if (soapHeader == null){
                    soapHeader = soapEnv.addHeader();
                    //throw exception
                    generateSOAPErrMessage(soapMsg, "No SOAP header.");
                }

                //Get client mac address from SOAP header
                Iterator it = soapHeader.extractHeaderElements(SOAPConstants.URI_SOAP_ACTOR_NEXT);

                //if no header block for next actor found? throw exception
                if (it == null || !it.hasNext()){
                    generateSOAPErrMessage(soapMsg, "No header block for next actor.");
                }

                //if no mac address found? throw exception
                Node macNode = (Node) it.next();
                String macValue = (macNode == null) ? null : macNode.getValue();

                if (macValue == null){
                    generateSOAPErrMessage(soapMsg, "No mac address in header block.");
                }

                //if mac address is not match, throw exception
                if(!macValue.equals("90-4C-E5-44-B9-8F")){
                    generateSOAPErrMessage(soapMsg, "Invalid mac address, access is denied.");
                }

                //tracking
                soapMsg.writeTo(System.out);

            }catch(SOAPException e){
                System.err.println(e);
            }catch(IOException e){
                System.err.println(e);
            }

        }

        //continue other handler chain
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {

        System.out.println("Server : handleFault()......");

        return true;
    }

    @Override
    public void close(MessageContext context) {
        System.out.println("Server : close()......");
    }

    @Override
    public Set<QName> getHeaders() {
        System.out.println("Server : getHeaders()......");
        return null;
    }

    private void generateSOAPErrMessage(SOAPMessage msg, String reason) {
        try {
            SOAPBody soapBody = msg.getSOAPPart().getEnvelope().getBody();
            SOAPFault soapFault = soapBody.addFault();
            soapFault.setFaultString(reason);
            throw new SOAPFaultException(soapFault);
        }
        catch(SOAPException e) { }
    }

    public static String sign() throws NoSuchAlgorithmException, UnsupportedEncodingException, UnrecoverableKeyException , CertificateException , KeyStoreException , InvalidKeySpecException , IOException , InvalidKeyException, SignatureException {
        PrivateKey pkey= getCertificateDetails(jksPath , jksPassword).getPrivateKey();
        String signedString = null;
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(pkey);
        byte[] signatureBytes = signature.sign();
        byte[] encryptedByteValue = Base64.encodeBase64(signatureBytes);
        signedString = new String(encryptedByteValue, "UTF-8");
        System.out.println(signedString);
        return signedString;
    }

    public static CertificateDetails getCertificateDetails(String jksPath, String jksPassword) {

        CertificateDetails certDetails = null;

        try {

            boolean isAliasWithPrivateKey = false;
            KeyStore keyStore = KeyStore.getInstance("JKS");

            // Provide location of Java Keystore and password for access
            keyStore.load(new FileInputStream(jksPath), jksPassword.toCharArray());

            // iterate over all aliases
            Enumeration<String> es = keyStore.aliases();
            String alias = "";
            while (es.hasMoreElements()) {
                alias = (String) es.nextElement();
                // if alias refers to a private key break at that point
                // as we want to use that certificate
                if (isAliasWithPrivateKey = keyStore.isKeyEntry(alias)) {
                    break;
                }
            }

            if (isAliasWithPrivateKey) {

                KeyStore.PrivateKeyEntry pkEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry(alias,
                        new KeyStore.PasswordProtection(jksPassword.toCharArray()));

                PrivateKey myPrivateKey = pkEntry.getPrivateKey();

                // Load certificate chain
                Certificate[] chain = keyStore.getCertificateChain(alias);

                certDetails = new CertificateDetails();
                certDetails.setPrivateKey(myPrivateKey);
                certDetails.setX509Certificate((X509Certificate) chain[0]);

            }

        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (CertificateException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnrecoverableEntryException e) {
            e.printStackTrace();
        }

        return certDetails;
    }

}