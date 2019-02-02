package com.experts.core.biller.statemachine.api.security.encrypt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.xml.bind.DatatypeConverter;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service("asymmetricCryptographyService")
public class AsymmetricCryptoService {
    private Cipher cipher;
    @Autowired
    private GenerateKeysService generateKeysService;
    public AsymmetricCryptoService(){
    }
    public String init(String xml) throws Exception {

                Cipher cipher = Cipher.getInstance("RSA");
                generateKeysService.keyGenerateAndReturnPublicKey("1230125");
                cipher.init(Cipher.ENCRYPT_MODE, generateKeysService.readPrivateKey("1230125"));
                byte[] encodedUser = DatatypeConverter.parseBase64Binary(xml);
                String code = new String(cipher.doFinal(encodedUser), "UTF-8");
                String res = Base64.encodeBase64String(code.getBytes());
                System.out.println("Code : -------------------- "+ Base64.encodeBase64String(code.getBytes()));
                return res;
    }
}