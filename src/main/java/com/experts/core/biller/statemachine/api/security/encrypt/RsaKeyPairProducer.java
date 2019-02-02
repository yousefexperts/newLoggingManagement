package com.experts.core.biller.statemachine.api.security.encrypt;

import java.security.KeyPair;
import java.security.KeyPairGenerator;


public class RsaKeyPairProducer {


    public KeyPair produce() {
        KeyPairGenerator keyGen;
        try {
            keyGen = KeyPairGenerator.getInstance("RSA");

            keyGen.initialize(4096);
            return keyGen.generateKeyPair();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}