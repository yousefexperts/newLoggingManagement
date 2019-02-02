package com.experts.core.biller.statemachine.api.security.encrypt;


import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.security.*;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.LinkedList;

@Component
public class GenerateAndVerifySignature {
    private static final Logger LOGGER = LoggerFactory.getLogger(GenerateAndVerifySignature.class.getName());
    private static final String jksPath = "C:/jks/biller_core_keystore.jks", jksPassword = "opc@2018";
    public static String generateSignature(String requestBody)
            throws Exception {
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        PrivateKey privateKeyMFEP = getPrivateKey("biller.pfx");// MFEP.pfx
        byte[] requestBodyByte = requestBody.trim().getBytes("UTF-16LE");
        byte[] digitalSignature = signData(requestBodyByte, privateKeyMFEP);
        // digitalSignatureBase64 = digitalSignatureBase64.replaceAll("\\s+", "");
        return new String(Base64.encodeBase64(digitalSignature)).trim();
    }

    private static byte[] signData(byte[] data, PrivateKey key) throws Exception {
        Signature signer = Signature.getInstance("SHA256withRSA");// SHA1withDSA  // SHA256withRSA
        signer.initSign(key);
        signer.update(data);
        return (signer.sign());
    }

    private static boolean verifySig(byte[] data, PublicKey key, byte[] sig) throws Exception {
        Signature signer = Signature.getInstance("SHA256withRSA");
        signer.initVerify(key);
        signer.update(data);
        return (signer.verify(sig));

    }

    private static final Collection<String> signerCertificates = new LinkedList<>();

    private static final String NEWLINE_CHARACTER = "\n";
    private static final String PFX_PASSWORD = "opc@2018";

    private static final String CERT_BEGIN = "-----BEGIN CERTIFICATE-----" + NEWLINE_CHARACTER;
    private static final String END_CERT = "-----END CERTIFICATE-----" + NEWLINE_CHARACTER;

    private static final String PRIVATE_KEY_BEGIN = "-----BEGIN PRIVATE KEY-----" + NEWLINE_CHARACTER;
    private static final String PRIVATE_KEY_END = "-----END PRIVATE KEY-----" + NEWLINE_CHARACTER;

    private static final String PFX_FILE_PATH = "<Full path to your pfx file including its file name>";

    private static PrivateKey getPrivateKey(String certificatePath) throws IOException,  KeyStoreException, NoSuchAlgorithmException, CertificateException, UnrecoverableKeyException , NoSuchProviderException , UnrecoverableEntryException{

        KeyStore ks = KeyStore.getInstance("JKS");
        ks.load(new FileInputStream(ResourceUtils.getFile("classpath:biller_core_keystore.jks")),"opc@2018".toCharArray());

        // iterate over all aliases
        Enumeration es = ks.aliases();
        String alias = "biller";
        boolean isAliasWithPrivateKey = false;
        /*while (es.hasMoreElements())
        {
            alias = (String) es.nextElement();
            // if alias refers to a private key break at that point as we want to use that certificate
            if (isAliasWithPrivateKey = ks.isKeyEntry(alias))
            {
                break;
            }
        }*/


        KeyStore.PrivateKeyEntry pkEntry = (KeyStore.PrivateKeyEntry) ks.getEntry(alias, new KeyStore.PasswordProtection(PFX_PASSWORD.toCharArray()));

        //format the public certificate
        Certificate publicKeyCertificate = pkEntry.getCertificate();
        String publicCertificatePem = formatCert(Base64.encodeBase64String(publicKeyCertificate.getEncoded()));
        String leafPublicCertificatePem = CERT_BEGIN + publicCertificatePem + END_CERT;
        System.out.println(leafPublicCertificatePem);

        //format the private key
        PrivateKey privateKey = pkEntry.getPrivateKey();
        String privatePem = formatCert(Base64.encodeBase64String(privateKey.getEncoded()));
        String leafPrivateKey = PRIVATE_KEY_BEGIN + privatePem + PRIVATE_KEY_END;
        System.out.println(leafPrivateKey);

       // SecurityProvider securityProviderX509 = new SecurityProviderX509Cert(leafPublicCertificatePem, leafPrivateKey, signerCertificates);
        return privateKey;
    }

    private static String formatCert(String base64EncodedCert)
    {
        ArrayList<String> certLines = new ArrayList<>();
        while (base64EncodedCert.length() > 64)
        {
            //peel off the next 64 characters
            certLines.add(base64EncodedCert.substring(0, 64));
            base64EncodedCert = base64EncodedCert.substring(64);
        }
        certLines.add(base64EncodedCert);

        for (int i = 0; i < certLines.size(); i++)
        {
            //add newline to the end of each line
            certLines.set(i, certLines.get(i).concat(NEWLINE_CHARACTER));
        }

        String pemBody = "";
        for (int i = 0; i < certLines.size(); i++)
        {
            //add all lines back together
            pemBody += certLines.get(i);
        }

        return pemBody;
    }
    public static boolean verifyRequestSignature(String requestBody, String requestSignature) {
        Boolean result = false;
        try {
            byte[] requestBodyByte = requestBody.trim().getBytes("UTF-16LE");//
            PublicKey publicKey = getPublicKey("biller.cer");
            result = verify(requestSignature, requestBodyByte, publicKey);
        } catch (Exception e) {
            LOGGER.error("unable to verify signature [{}], [{}]", requestBody, requestSignature);
        }
        return result;
    }

    private static PublicKey getPublicKey(String certificatePath) throws FileNotFoundException, CertificateException, IOException {
        PublicKey pk = null;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("D:/certs/"+certificatePath);
            CertificateFactory f = CertificateFactory.getInstance("X.509");
            X509Certificate certificate = (X509Certificate) f.generateCertificate(fin);
            pk = certificate.getPublicKey();
        } finally {
            if (fin != null) {
                fin.close();
            }
        }
        return pk;
    }

    private static boolean verify(String requestSignature, byte[] RequestBodyByte, PublicKey publicKey) throws FileNotFoundException, CertificateException, IOException, Exception {
        boolean verified;
        byte[] dencode64Signature = Base64.decodeBase64(requestSignature.trim());
        byte[] dencode64Signature2;
        verified = verifySig(RequestBodyByte, publicKey, dencode64Signature); // Verify Madfooatcom Public Key
        return verified;
    }
}