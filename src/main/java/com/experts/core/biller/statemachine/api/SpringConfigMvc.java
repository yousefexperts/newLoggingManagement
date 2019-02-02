package com.experts.core.biller.statemachine.api;

import com.experts.core.biller.statemachine.api.service.impl.PaymentNotificationController;
import com.experts.core.biller.statemachine.api.service.impl.PaymentPrePaidController;
import com.experts.core.biller.statemachine.api.service.impl.PaymentServiceController;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
/*import org.springframework.cloud.dataflow.server.EnableDataFlowServer;*/
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.accept.ContentNegotiationStrategy;
import org.springframework.web.accept.HeaderContentNegotiationStrategy;
import org.springframework.web.accept.PathExtensionContentNegotiationStrategy;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.DefaultRequestToViewNameTranslator;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.validation.XmlValidator;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import org.springframework.xml.xsd.XsdSchemaCollection;



import java.nio.charset.Charset;
import java.util.*;



@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = { PaymentNotificationController.class  , PaymentServiceController.class , PaymentPrePaidController.class })
@Import({ PaymentNotificationController.class , PaymentPrePaidController.class , PaymentServiceController.class})
public class SpringConfigMvc extends WebMvcConfigurerAdapter /*implements WebApplicationInitializer*/ {

    @Bean
    public StringHttpMessageConverter stringMessageConverter() {
        return new StringHttpMessageConverter();
    }

    private MappingJackson2HttpMessageConverter jacksonConverter() {
       ObjectMapper mapper = objectMapper();

        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);

        SimpleModule simpleModule = new SimpleModule("SimpleModule", Version.unknownVersion());

        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);

        mapper.registerModule(simpleModule);
        mapper.setVisibility(PropertyAccessor.FIELD, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY);
        MappingJackson2HttpMessageConverter jacksonConverter = new MappingJackson2HttpMessageConverter();
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        jacksonConverter.setObjectMapper(mapper);


        return jacksonConverter;
    }


    @Bean
    public ServerProperties serverProperties() {
        return new IgnoreUnknownFieldsServerProperties();
    }

    @EnableConfigurationProperties ()
    public static class IgnoreUnknownFieldsServerProperties extends ServerProperties {

    }


    @Autowired
    private Environment environment;

    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add( jacksonConverter());
        converters.add(new FormHttpMessageConverter());
        converters.add(new StringHttpMessageConverter(Charset.forName("UTF-8")));
        converters.add(new MappingJackson2HttpMessageConverter());
        converters.add(new Jaxb2RootElementHttpMessageConverter());
        converters.add(new StringHttpMessageConverter(Charset.defaultCharset().forName("UTF-8")));

    }
    public static final String API_PREFIX = "/*";


    @Bean
    public SessionLocaleResolver sessionLocaleResolver(){
        Locale locale = new Locale("ko");
        SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
        sessionLocaleResolver.setDefaultLocale(locale);
        return sessionLocaleResolver;
    }

    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor(){
        LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
        localeChangeInterceptor.setParamName("lang");
        return localeChangeInterceptor;
    }

    @Bean
    public DefaultRequestToViewNameTranslator defaultRequestToViewNameTranslator(){
        return new DefaultRequestToViewNameTranslator();
    }

    @Bean
    public MultipartResolver multipartResolver() {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setMaxUploadSize(10240000);
        return multipartResolver;
    }

    @Bean(name="viewNameTranslator")
    public DefaultRequestToViewNameTranslator viewNameTranslator(){
        return new DefaultRequestToViewNameTranslator();
    }



    @Bean
    public ContentNegotiatingViewResolver contentNegotiatingViewResolver(){

        ContentNegotiatingViewResolver negotiating = new ContentNegotiatingViewResolver();


        Map<String, MediaType> mediaTypes = new HashMap<>();
        mediaTypes.put("html", MediaType.TEXT_HTML);
        mediaTypes.put("json", MediaType.APPLICATION_JSON);
        mediaTypes.put("jsonp", MediaType.APPLICATION_JSON);
        mediaTypes.put("xml",  MediaType.APPLICATION_XML);
        mediaTypes.put("atom", MediaType.APPLICATION_ATOM_XML);

        ContentNegotiationStrategy pathExtensionContentNegotiationStrategy = new PathExtensionContentNegotiationStrategy(mediaTypes);
        ContentNegotiationStrategy  headerContentNegotiationStrategy = new HeaderContentNegotiationStrategy();
        ContentNegotiationManager contentNegotiationManager = new ContentNegotiationManager(pathExtensionContentNegotiationStrategy, headerContentNegotiationStrategy);
        negotiating.setContentNegotiationManager(contentNegotiationManager);



        List<View> JsonView = new ArrayList<>();

        MappingJackson2JsonView mappingJackson2JsonView = new MappingJackson2JsonView();
        mappingJackson2JsonView.setExtractValueFromSingleKeyModel(true);
        JsonView.add(mappingJackson2JsonView);

        negotiating.setDefaultViews(JsonView);

        negotiating.setOrder(2);

        return negotiating;
    }

    @Bean
    public com.fasterxml.jackson.databind.ObjectMapper objectMapper() {

        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
        builder.serializationInclusion(JsonInclude.Include.NON_EMPTY);

        builder.featuresToDisable(
                SerializationFeature.FAIL_ON_EMPTY_BEANS,
                DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES,
                DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        builder.featuresToEnable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

        return builder.build();
    }



    @Bean(name = "BillPullRequest")
    @Order(-1)
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema billpull) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("BillPullResponse");
        wsdl11Definition.setLocationUri("/billpull");
        wsdl11Definition.setTargetNamespace("http://192.168.10.230:3070/ws/billpull");
        wsdl11Definition.setSchema(billpull);
        wsdl11Definition.setCreateSoap11Binding(true);
        return wsdl11Definition;
    }


   /* @Bean(name = "wsdl_inquriy")
    @Order(-2)
    public DefaultWsdl11Definition defaultWsdl1Definition(XsdSchema pdpext) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("UserRequest");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://www.experts.ps/ws/inquiry");
        wsdl11Definition.setSchema(pdpext);

        return wsdl11Definition;
    }*/

    @Bean(name = "NotificationRequest")
    @Order(-3)
    public DefaultWsdl11Definition defaultWsdlNotifactionDefinition(XsdSchema notification) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("NotificationRequest");
        wsdl11Definition.setLocationUri("/notifaction");
        wsdl11Definition.setTargetNamespace("http://localhost:3070/ws/notifaction");
        wsdl11Definition.setSchema(notification);

        return wsdl11Definition;
    }

    @Bean(name = "PrePaidRequest")
    @Order(-4)
    public DefaultWsdl11Definition defaultWsdlPerpaidDefinition(XsdSchema prepaid) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("PrePaidRequest");
        wsdl11Definition.setLocationUri("/prepaid");
        wsdl11Definition.setTargetNamespace("http://localhost:3070/ws/prepaid");
        wsdl11Definition.setSchema(prepaid);

        return wsdl11Definition;
    }


    @Bean(name = "PaymentRequest")
    @Order(-5)
    public DefaultWsdl11Definition paymentWsdl11Definition(XsdSchema payment) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("PaymentRequest");
        wsdl11Definition.setLocationUri("/payment");
        wsdl11Definition.setTargetNamespace("http://localhost:3070/ws/payment");
        wsdl11Definition.setSchema(payment);

        return wsdl11Definition;
    }

    @Bean(name = "InquiryRequest")
    @Order(-6)
    public DefaultWsdl11Definition inquiryWsdl11Definition(XsdSchema inquiry) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("InquiryRequest");
        wsdl11Definition.setLocationUri("/inquiry");
        wsdl11Definition.setTargetNamespace("http://localhost:3070/ws/inquiry");
        wsdl11Definition.setSchema(inquiry);
        wsdl11Definition.setCreateSoap11Binding(true);
        return wsdl11Definition;
    }

    /*@Bean(name =  "inquiry")
    public CommonsXsdSchemaCollection schemas() throws IOException , IllegalAccessException , InstantiationException  {
        CommonsXsdSchemaCollection schemaCollection = new CommonsXsdSchemaCollection();
        Resource inquiry = new ClassPathResource("pdp-ext.xsd");
        Resource pulling = new ClassPathResource("billpull.xsd");
        schemaCollection.setXsds(inquiry , pulling);
        return schemaCollection;
    }*/


    @Bean(name  = "billpull")
    @Order(-1)
    public XsdSchema billpull(){
        return new SimpleXsdSchema(new ClassPathResource("billpull.xsd"));}

    @Bean(name  = "inquiry")
    @Order(-8)
    public XsdSchema inquiry(){
        return new  SimpleXsdSchema(new ClassPathResource("inquiry-xsd.xsd"));}


    @Bean(name  = "pdpext")
    @Order(-2)
    public XsdSchema pdpext(){
        return new  SimpleXsdSchema(new ClassPathResource("pdp-ext.xsd"));
    }


    @Bean(name  = "notification")
    public XsdSchema notification(){
        return new  SimpleXsdSchema(new ClassPathResource("pay-notification.xsd"));
    }


    @Bean(name  = "prepaid")
    @Order(-4)
    public XsdSchema prepaid(){
        return new  SimpleXsdSchema(new ClassPathResource("prepaid-service-validation.xsd"));
    }


    @Bean(name  = "payment")
    @Order(-5)
    public XsdSchema payment(){
        return new  SimpleXsdSchema(new ClassPathResource("payment-service.xsd"));
    }


    @Bean
    public XsdSchemaCollection quotesSchemaCollection() {
        return new XsdSchemaCollection() {

            public XsdSchema[] getXsdSchemas() {
                return new XsdSchema[]{new SimpleXsdSchema(new ClassPathResource("billpull.xsd")) , new SimpleXsdSchema(new ClassPathResource("pdp-ext.xsd")) };
            }

            public XmlValidator createValidator() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Bean
    public HttpComponentsMessageSender messageSender() {
        HttpComponentsMessageSender httpComponentsMessageSender = new HttpComponentsMessageSender();
        return httpComponentsMessageSender;
    }



}