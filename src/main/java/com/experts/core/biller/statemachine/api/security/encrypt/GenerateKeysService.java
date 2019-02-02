package com.experts.core.biller.statemachine.api.security.encrypt;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.bind.DatatypeConverter;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;

@Component
@Service("generateKeysService")
public class GenerateKeysService {

    @Autowired
    private JDBCInMemory jdbcInMemory;

    private KeyPairGenerator keyGen;
    private PrivateKey privateKey;
    private PublicKey publicKey;
    private static final String PUBLICKEY_PREFIX    = "-----BEGIN PUBLIC KEY-----";
    private static final String PUBLICKEY_POSTFIX   = "-----END PUBLIC KEY-----";
    private static final String PRIVATEKEY_PREFIX   = "-----BEGIN RSA PRIVATE KEY-----";
    private static final String PRIVATEKEY_POSTFIX  = "-----END RSA PRIVATE KEY-----";


    public GenerateKeysService(){}
    private void generateSecureKeys() throws NoSuchAlgorithmException, NoSuchProviderException {
        this.keyGen = KeyPairGenerator.getInstance("RSA");
        this.keyGen.initialize(8192);
    }

    private void createKeys() throws NoSuchAlgorithmException , InvalidKeySpecException , IOException {
        KeyPair pair = this.keyGen.generateKeyPair();
        this.privateKey = pair.getPrivate();
        this.publicKey = pair.getPublic();

        KeyFactory fact = KeyFactory.getInstance("RSA");
        RSAPublicKeySpec pub = (RSAPublicKeySpec) fact.getKeySpec(publicKey, RSAPublicKeySpec.class);
        RSAPrivateKeySpec priv = (RSAPrivateKeySpec) fact.getKeySpec(privateKey, RSAPrivateKeySpec.class);

        // Save the file to local drive
        saveToFile("c:/keypair/public.key", pub.getModulus(), pub.getPublicExponent());
        saveToFile("c:/keypair/private.key", priv.getModulus(), priv.getPrivateExponent());

    }

    public static void saveToFile(String fileName, BigInteger mod, BigInteger exp) throws IOException {
        ObjectOutputStream oout = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
        try {
            oout.writeObject(mod);
            oout.writeObject(exp);
        } catch (Exception e) {
            throw new IOException("Unexpected error", e);
        } finally {
            oout.close();
        }
    }

    private PrivateKey getPrivateKey() {
        return this.privateKey;
    }

    private PublicKey getPublicKey() {
        return this.publicKey;
    }

    private void saveKeysInDb (String appId, String publicKey, String privateKey)
    {
        this.jdbcInMemory.insertData(appId, publicKey, privateKey);
    }


    public String keyGenerateAndReturnPublicKey(String appId) {
        String publicKeyPEM = null;
        String privateKeyPEM;
        System.out.println("main method of generator");
        try {
            this.generateSecureKeys();
            this.createKeys();

            // THIS IS PEM:
            publicKeyPEM = PUBLICKEY_PREFIX + "\n" + DatatypeConverter.printBase64Binary(this.getPublicKey().getEncoded()).replaceAll("(.{64})", "$1\n") + "\n" + PUBLICKEY_POSTFIX;
            privateKeyPEM = PRIVATEKEY_PREFIX + "\n" + DatatypeConverter.printBase64Binary(this.getPrivateKey().getEncoded()).replaceAll("(.{64})", "$1\n") + "\n" + PRIVATEKEY_POSTFIX;
            this.saveKeysInDb(appId,publicKeyPEM,privateKeyPEM);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return publicKeyPEM;
    }
    public PrivateKey readPrivateKey(String appId)
            throws IOException, GeneralSecurityException {
        PrivateKey key;
        String fileString = this.jdbcInMemory.getPrivateKeyForAppId(appId);
        fileString = fileString.replace(
                "-----BEGIN RSA PRIVATE KEY-----\n", "")
                .replace("-----END RSA PRIVATE KEY-----", "");
        byte[] keyBytes = DatatypeConverter.parseBase64Binary(fileString);
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        key = kf.generatePrivate(spec);
        return key;
    }

}