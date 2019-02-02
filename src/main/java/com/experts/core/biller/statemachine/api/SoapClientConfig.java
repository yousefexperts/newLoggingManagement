package com.experts.core.biller.statemachine.api;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;
import org.springframework.ws.soap.security.wss4j2.callback.KeyStoreCallbackHandler;
import org.springframework.ws.soap.security.wss4j2.support.CryptoFactoryBean;
/*import org.springframework.ws.soap.security.xwss.callback.KeyStoreCallbackHandler;*/

import java.io.IOException;
import java.net.ConnectException;

@Configuration
public class SoapClientConfig {

    @Bean
    public KeyStoreCallbackHandler securityCallbackHandler() throws Exception {
        KeyStoreCallbackHandler callbackHandler = new KeyStoreCallbackHandler();
        callbackHandler.setSymmetricKeyPassword("opc@2018");
        return callbackHandler;
    }

    @Bean
    public Wss4jSecurityInterceptor securityInterceptor() throws IOException, Exception {

        Wss4jSecurityInterceptor securityInterceptor = new Wss4jSecurityInterceptor();

        // set security actions
        securityInterceptor.setSecurementActions("Timestamp Signature");
        securityInterceptor.setSecurementUsername("biller_core_keystore");
        securityInterceptor.setSecurementPassword("opc@2018");

        //sign both body and timestamp - default body will be signed
        securityInterceptor.setSecurementSignatureParts("{Content}{http://localhost:3070/billpull}billPullServiceRequest;{}{http://localhost:3070/notifaction}paymentNotificationRequest;{}{http://localhost:3070/prepaid}prePaidServiceRequest;{}{http://localhost:3070/payment}paymentOrderRequest;");

        //This will generate binarySecurityToken in header
        securityInterceptor.setSecurementSignatureKeyIdentifier("DirectReference");
        securityInterceptor.setSecurementSignatureCrypto(getRequestCrypto().getObject());

        return securityInterceptor;
    }

    @Bean
    public CryptoFactoryBean getRequestCrypto() throws IOException {

        CryptoFactoryBean cryptoFactoryBean = new CryptoFactoryBean();
        cryptoFactoryBean.setKeyStorePassword("opc@2018");
        cryptoFactoryBean.setKeyStoreLocation(new ClassPathResource("biller_core_keystore.jks"));
        return cryptoFactoryBean;
    }

    @Bean
    public Wss4jSecurityInterceptor responseSecurityInterceptor() throws IOException, Exception {

        Wss4jSecurityInterceptor securityInterceptor = new Wss4jSecurityInterceptor();
        securityInterceptor.setValidationActions("Timestamp Signature");
        securityInterceptor.setValidationSignatureCrypto(getResponseCrypto().getObject());
        securityInterceptor.setValidationCallbackHandler(securityCallbackHandler());

        return securityInterceptor;
    }

    @Bean
    public CryptoFactoryBean getResponseCrypto() throws Exception {

        CryptoFactoryBean cryptoFactoryBean = new CryptoFactoryBean();
        cryptoFactoryBean.setKeyStoreLocation(new ClassPathResource("biller_core_keystore.jks"));
        cryptoFactoryBean.setDefaultX509Alias("1");
        cryptoFactoryBean.setKeyStorePassword("opc@2018");
        cryptoFactoryBean.afterPropertiesSet();
        return cryptoFactoryBean;
    }




}