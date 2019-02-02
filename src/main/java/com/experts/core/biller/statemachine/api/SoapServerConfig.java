package com.experts.core.biller.statemachine.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.EndpointInterceptor;
/*import org.springframework.ws.soap.security.wss4j.Wss4jSecurityInterceptor;*/
/*import org.springframework.ws.soap.security.wss4j.support.CryptoFactoryBean;*/
/*import org.springframework.ws.soap.security.xwss.callback.KeyStoreCallbackHandler;*/
/*import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;
*//*import org.springframework.ws.soap.security.wss4j2.callback.KeyStoreCallbackHandler;*//*
import org.springframework.ws.soap.security.wss4j2.support.CryptoFactoryBean;*/

import org.springframework.ws.server.endpoint.mapping.PayloadRootQNameEndpointMapping;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;
import org.springframework.ws.soap.security.wss4j2.callback.KeyStoreCallbackHandler;
import org.springframework.ws.soap.security.wss4j2.support.CryptoFactoryBean;
import org.springframework.ws.soap.server.endpoint.interceptor.PayloadValidatingInterceptor;

import java.io.IOException;
import java.util.List;

@EnableWs
@Configuration
public class SoapServerConfig extends WsConfigurerAdapter {

    Logger logger = LoggerFactory.getLogger(SoapServerConfig.class);

    @Bean
    public KeyStoreCallbackHandler securityCallbackHandler(){
        KeyStoreCallbackHandler callbackHandler = new KeyStoreCallbackHandler();
        callbackHandler.setPrivateKeyPassword("opc@2018");
        return callbackHandler;
    }

   /* @Bean
    public Wss4jSecurityInterceptor securityInterceptor() throws Exception {
        Wss4jSecurityInterceptor securityInterceptor = new Wss4jSecurityInterceptor();

        // validate incoming request
        securityInterceptor.setValidationActions("Timestamp Signature Encrypt");
        securityInterceptor.setValidationSignatureCrypto(getCryptoFactoryBean().getObject());
        securityInterceptor.setValidationDecryptionCrypto(getCryptoFactoryBean().getObject());
        securityInterceptor.setValidationCallbackHandler(securityCallbackHandler());

        // encrypt the response
        securityInterceptor.setSecurementEncryptionUser("biller_core_keystore");
        securityInterceptor.setSecurementEncryptionParts("{Content}{http://www.experts.ps/ws/inquiry,http://www.experts.ps/ws/billpull,http://www.experts.ps/ws/notifaction,http://www.experts-prepaid.com/prepaid,http://www.experts-payment.com/payment}fetch");
        securityInterceptor.setSecurementEncryptionCrypto(getCryptoFactoryBean().getObject());

        // sign the response
        securityInterceptor.setSecurementActions("Signature Encrypt");
        securityInterceptor.setSecurementUsername("biller_core_keystore");
        securityInterceptor.setSecurementPassword("opc@2018");
        securityInterceptor.setSecurementSignatureCrypto(getCryptoFactoryBean().getObject());

        return securityInterceptor;
    }*/

    @Bean
    public CryptoFactoryBean getCryptoFactoryBean() throws IOException {
        CryptoFactoryBean cryptoFactoryBean = new CryptoFactoryBean();
        cryptoFactoryBean.setKeyStorePassword("opc@2018");
        cryptoFactoryBean.setKeyStoreLocation(new ClassPathResource("biller_core_keystore.jks"));
        return cryptoFactoryBean;
    }


    @Bean
    PayloadValidatingInterceptor payloadBillPullValidatingInterceptor() {
        final PayloadValidatingInterceptor payloadValidatingInterceptor = new PayloadValidatingInterceptor();
        payloadValidatingInterceptor.setSchema(new ClassPathResource("billpull.xsd"));
        return payloadValidatingInterceptor;
    }

    @Bean
    PayloadValidatingInterceptor payloadNotificationValidatingInterceptor() {
        final PayloadValidatingInterceptor payloadValidatingInterceptor = new PayloadValidatingInterceptor();
        payloadValidatingInterceptor.setSchema(new ClassPathResource("pay-notification.xsd"));
        return payloadValidatingInterceptor;
    }

    @Bean
    PayloadValidatingInterceptor payloadPrePaidValidatingInterceptor() {
        final PayloadValidatingInterceptor payloadValidatingInterceptor = new PayloadValidatingInterceptor();
        payloadValidatingInterceptor.setSchema(new ClassPathResource("prepaid-service-validation.xsd"));
        return payloadValidatingInterceptor;
    }


    @Bean
    PayloadValidatingInterceptor payloadPaymentValidatingInterceptor() {
        final PayloadValidatingInterceptor payloadValidatingInterceptor = new PayloadValidatingInterceptor();
        payloadValidatingInterceptor.setSchema(new ClassPathResource("payment-service.xsd"));
        return payloadValidatingInterceptor;
    }


    @Override
    public void addInterceptors(List<EndpointInterceptor> interceptors) {
        interceptors.add(serverSecurityInterceptor());
    }

    @Bean
    public Wss4jSecurityInterceptor serverSecurityInterceptor() {
        Wss4jSecurityInterceptor securityInterceptor = new Wss4jSecurityInterceptor();

        securityInterceptor.setValidationActions("Encrypt");

        securityInterceptor.setValidationCallbackHandler(securityCallbackHandler());

        try {
            securityInterceptor
                    .setValidationDecryptionCrypto(getCryptoFactoryBean().getObject());
        } catch (Exception e) {
            logger.error("unable to get the server key store", e);
        }

        // encrypt the outgoing messages
        securityInterceptor.setSecurementActions("Encrypt");
        // set the part of the content that needs to be encrypted
        securityInterceptor.setSecurementEncryptionParts(
                "{Content}{http://localhost:3070/billpull}billPullResponseDTO;{}{http://localhost:3070/notifaction}paymentNotificationResponse;{}{http://localhost:3070/prepaid}prePaidServiceResponse;{}{http://localhost:3070/payment}paymentOrderResponse;");
        // alias of the public certificate used to encrypt
        securityInterceptor.setSecurementEncryptionUser("opc@2018#123");
        // trust store that contains the public certificate used to encrypt
        try {
            securityInterceptor
                    .setSecurementEncryptionCrypto(getCryptoFactoryBean().getObject());
        } catch (Exception e) {
            logger.error("unable to get the server trust store", e);
        }

        return securityInterceptor;
    }

     @Autowired
     private ApplicationContext applicationContext;

     @Bean
     @Primary
     public PayloadRootQNameEndpointMapping payloadRootQNameEndpointMapping(){
         PayloadRootQNameEndpointMapping mapping = new PayloadRootQNameEndpointMapping();
         /*mapping.setApplicationContext(applicationContext);
         Map<String,Object> maps= new HashMap<>();
         maps.put("http://192.168.10.91:3070/ws/billpull","BillPullServiceRequest");

         mapping.setEndpointMap(maps);*/

         return mapping;

     }
}