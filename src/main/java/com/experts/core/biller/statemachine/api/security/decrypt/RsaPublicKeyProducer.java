package com.experts.core.biller.statemachine.api.security.decrypt;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;


public class RsaPublicKeyProducer {

    public PublicKey produce(byte[] encodedByteArrayForPublicKey) {
        try {
            PublicKey publicKey = KeyFactory.getInstance("RSA")
                    .generatePublic(new X509EncodedKeySpec(encodedByteArrayForPublicKey));

            return publicKey;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}