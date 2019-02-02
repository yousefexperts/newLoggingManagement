package com.experts.core.biller.statemachine.api.security.encrypt;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;


public class RsaPrivateKeyProducer {


    public PrivateKey produce(byte[] encodedByteArrayForPrivateKey) {
        try {
            PrivateKey privateKey = KeyFactory.getInstance("RSA")
                    .generatePrivate(new PKCS8EncodedKeySpec(encodedByteArrayForPrivateKey));

            return privateKey;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}