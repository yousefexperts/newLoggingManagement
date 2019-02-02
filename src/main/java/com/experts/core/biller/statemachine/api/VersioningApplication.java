package com.experts.core.biller.statemachine.api;

import com.experts.core.biller.statemachine.api.activemq.standers.config.AtomikFactoryBean;
import com.experts.core.biller.statemachine.api.activemq.standers.config.CustomerConfig;
import com.experts.core.biller.statemachine.api.activemq.standers.config.XAPublisherTemplate;
/*import com.experts.core.biller.statemachine.api.activemq.standers.controller.admin.ControlPanelController;
import com.experts.core.biller.statemachine.api.activemq.standers.controller.board.DashboardController;*/
/*import com.experts.core.biller.statemachine.api.activemq.standers.controller.rest.CommonRestController;*/
/*import com.experts.core.biller.statemachine.api.activemq.standers.service.AccountService;
import com.experts.core.biller.statemachine.api.activemq.standers.service.BaseService;
import com.experts.core.biller.statemachine.api.activemq.standers.service.MenuService;
import com.experts.core.biller.statemachine.api.activemq.standers.service.UserService;*/

import com.experts.core.biller.statemachine.api.annotation.StatesOnStates;
import com.experts.core.biller.statemachine.api.annotation.StatesOnTransition;
import com.experts.core.biller.statemachine.api.auth.*;
import com.experts.core.biller.statemachine.api.model.domain.jpa.*;
import com.experts.core.biller.statemachine.api.security.encrypt.*;
import com.experts.core.biller.statemachine.api.service.impl.*;
import com.experts.core.biller.statemachine.api.transitions.*;
/*import io.undertow.predicate.Predicates;*/
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
/*import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteException;
import org.apache.ignite.Ignition;
import org.apache.ignite.cache.CacheAtomicityMode;
import org.apache.ignite.cache.CacheMode;
import org.apache.ignite.cache.CacheRebalanceMode;
import org.apache.ignite.configuration.*;
import org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi;
import org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.hazelcast.HazelcastAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ConcurrentTaskScheduler;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;
import javax.naming.NamingException;
import java.util.Arrays;
import java.util.concurrent.Executors;


@SpringBootApplication(exclude = {})
@Configuration
@EnableSwagger2
@ComponentScan(basePackages = {"com.experts.core.biller.statemachine.api",
        "com.experts.core.biller.statemachine.api.apachekafka",
        "com.experts.core.biller.statemachine.api.controller",
        "com.experts.core.biller.statemachine.api.execptions",
        "com.experts.core.biller.statemachine.api.interceptor",

        "com.experts.core.biller.statemachine.api.persist",
        "com.experts.core.biller.statemachine.api.transitions",

        "com.experts.core.biller.statemachine.api.activemq.standers.config"
}, basePackageClasses = {StatesOnStates.class, StatesOnTransition.class, GenerateAndVerifySignature.class
        , AtomikFactoryBean.class, AtomikFactoryBean.class, CustomerConfig.class
        /*CompleteStateController.class, */,
        /*PayStateController.class, WaitingStateController.class, InquiryPaymentsBillController.class,*/

        /*CXFConfig.class ,*/
        CompletedTransitionBean.class,
        FSMStartingBean.class,
        InitialTransitionBean.class,
        TransitionProcessBean.class,
        TransitionCancelBean.class,
        SpringConfigMvc.class,
        TransitionExecutionBean.class, WebSecurityConfig.class, CustomerConfig.class, XAPublisherTemplate.class, JDBCInMemory.class, GenerateKeysService.class, AsymmetricCryptoService.class, EncryptByPkService.class, WebApplicationInitializer.class, SOAPSecurityHandler.class, SpringConfigMvc.class, HeaderModifierAdvice.class, WebSecurityConfig.class, IInquiryServiceController.class, PaymentNotificationController.class, PaymentServiceController.class,
        TransitionPayBean.class}, excludeFilters = {})
/*@EnableJpaRepositories(basePackages = {"com.experts.core.biller.statemachine.api.repo"})*/
@EnableTransactionManagement
@EntityScan(basePackageClasses = {
        Roles.class, Tasks.class, TaskVariables.class,
        Users.class, IInquiryServiceController.class


})
@EnableCaching
@EnableWs
@EnableScheduling
/*@AutoConfigureBefore(AdminServerWebConfiguration.class)*/
@AutoConfigureAfter(HazelcastAutoConfiguration.class)
/*@EnableDataFlowServer*/
/*@EnableBinding(ProcessBuilder.Sink.class)*/
@Slf4j
/*@EnableDataFlowServer*/
/*
@ImportResource(locations = {"classpath*:amq-atomikos.xml"})
*/
public class VersioningApplication {
    {
        /*Properties systemProps = System.getProperties();
        systemProps.put("javax.net.ssl.keyStorePassword", "opc@2018");
        systemProps.put("javax.net.ssl.keyStore", "biller_core_keystore.jks");
        systemProps.put("javax.net.ssl.trustStore", "core.truststore");
        systemProps.put("javax.net.ssl.trustStorePassword", "opc@2018");
        System.setProperties(systemProps);*/
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(VersioningApplication.class).run(args);
    }


    @Bean(name = "manager")
    @Primary
    public CacheManager manager() {
        return new ConcurrentMapCacheManager("entities");
    }


    @Autowired
    private ApplicationEventPublisher publisher;

    @Autowired
    private WebServiceTemplate webServiceTemplate;


    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }


    @Autowired
    private ApplicationContext applicationContext;


    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Bean
    public TaskScheduler taskExecutor() {
        return new ConcurrentTaskScheduler(
                Executors.newScheduledThreadPool(3));
    }

    @Value("#{'${service.endpoint}'}")
    private String serviceEndpoint;

    @Value("#{'${marshaller.packages.to.scan}'}")
    private String marshallerPackagesToScan;

    @Value("#{'${unmarshaller.packages.to.scan}'}")
    private String unmarshallerPackagesToScan;


    @Bean
    public SaajSoapMessageFactory messageFactory() {
        SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory();
        messageFactory.afterPropertiesSet();
        return messageFactory;
    }


    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.experts.core.biller.statemachine.api.soapService");
        return marshaller;
    }

    @Bean
    public WebServiceTemplate createWebServiceTemplate() throws NamingException {

        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setDefaultUri("https://localhost:3070/v1/soap?wsdl");
        webServiceTemplate.setMarshaller(marshaller());
        webServiceTemplate.setUnmarshaller(marshaller());
        HttpComponentsMessageSender messageSender = new HttpComponentsMessageSender();
        webServiceTemplate.setMessageSender(messageSender);
        messageSender.setHttpClient(getHttpClient());
        return webServiceTemplate;
    }


    public HttpClient getHttpClient() {
        return HttpClientBuilder.create().build();
    }

    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ws/*");
    }


    /*@Bean
    public IgniteConfiguration igniteConfiguration() {
        IgniteConfiguration igniteConfiguration = new IgniteConfiguration();
        igniteConfiguration.setClientMode(false);


       *//* PersistentStoreConfiguration persistentStoreConfiguration = new PersistentStoreConfiguration();
        persistentStoreConfiguration.setPersistentStorePath("/opt/ignite/data/store");
        persistentStoreConfiguration.setWalArchivePath("/opt/ignite/data/walArchive");
        persistentStoreConfiguration.setWalStorePath("/opt/ignite/data/walStore");
        igniteConfiguration.setPersistentStoreConfiguration(persistentStoreConfiguration);
*//*

        *//*ConnectorConfiguration connectorConfiguration=new ConnectorConfiguration();
        connectorConfiguration.setPort(11211);
        connectorConfiguration.setHost("localhost");*//*

        igniteConfiguration.setPeerClassLoadingEnabled(false);
        AtomicConfiguration atomic = new AtomicConfiguration();
        igniteConfiguration.setSystemThreadPoolSize(512);
        igniteConfiguration.setPublicThreadPoolSize(512);

        atomic.setBackups(1);
        atomic.setAtomicSequenceReserveSize(512);
        igniteConfiguration.setAtomicConfiguration(atomic);


        *//*AlwaysFailoverSpi failoverSpi = new AlwaysFailoverSpi();
        failoverSpi.setMaximumFailoverAttempts(5);

        igniteConfiguration.setFailoverSpi(failoverSpi);*//*

        *//*igniteConfiguration.setMetricsLogFrequency(0);
        igniteConfiguration.setQueryThreadPoolSize(2);
        igniteConfiguration.setDataStreamerThreadPoolSize(1);
        igniteConfiguration.setManagementThreadPoolSize(2);
        igniteConfiguration.setPublicThreadPoolSize(2);
        igniteConfiguration.setSystemThreadPoolSize(2);
        igniteConfiguration.setRebalanceThreadPoolSize(1);
        igniteConfiguration.setAsyncCallbackPoolSize(2);
        igniteConfiguration.setPeerClassLoadingEnabled(false);
        igniteConfiguration.setIgniteInstanceName("biller");*//*
        *//*BinaryConfiguration binaryConfiguration = new BinaryConfiguration();
        binaryConfiguration.setCompactFooter(false);
        igniteConfiguration.setBinaryConfiguration(binaryConfiguration);*//*
        *//*igniteConfiguration.setConnectorConfiguration(connectorConfiguration);*

         *//*

        *//*DataStorageConfiguration dataStorageConfiguration = new DataStorageConfiguration();

        DataRegionConfiguration dataRegionConfiguration = new DataRegionConfiguration();

        dataRegionConfiguration.setName("Default_Region");

        dataRegionConfiguration.setInitialSize(4L *1024   * 1024);
        dataRegionConfiguration.setMaxSize(12L * 1024 * 1024);
        dataRegionConfiguration.setPersistenceEnabled(false);


        dataStorageConfiguration.setDataRegionConfigurations(dataRegionConfiguration);
        igniteConfiguration.setDataStorageConfiguration(dataStorageConfiguration);*//*

        *//*TcpDiscoverySpi tcpDiscoverySpi=new TcpDiscoverySpi();
        TcpDiscoveryVmIpFinder tcpDiscoveryVmIpFinder=new TcpDiscoveryVmIpFinder();

        tcpDiscoveryVmIpFinder.setAddresses(Arrays.asList("127.0.0.1:47500..47509"));
        tcpDiscoverySpi.setIpFinder(tcpDiscoveryVmIpFinder);
        igniteConfiguration.setDiscoverySpi(new TcpDiscoverySpi());*//*

       *//* FailoverSpi failoverSpi1 = new AlwaysFailoverSpi();
        failoverSpi.setMaximumFailoverAttempts(5);

        igniteConfiguration.setFailoverSpi(failoverSpi);*//*

        CacheConfiguration alerts=new CacheConfiguration();
        *//*alerts.setCopyOnRead(false);*//*
        *//*alerts.setOnheapCacheEnabled(true);*//*
        alerts.setCacheMode(CacheMode.REPLICATED);
        alerts.setEagerTtl(false);
        alerts.setBackups(0);
        alerts.setRebalanceMode(CacheRebalanceMode.SYNC);
        *//*alerts.setWriteSynchronizationMode(CacheWriteSynchronizationMode.FULL_SYNC);*//*
        alerts.setBackups(0);
        alerts.setAtomicityMode(CacheAtomicityMode.ATOMIC);
        alerts.setName("biller");
        *//*alerts.setIndexedTypes(String.class,AlertEntry.class);*//*

        *//*CacheConfiguration alertsConfig=new CacheConfiguration();
        alertsConfig.setCopyOnRead(false);
        alertsConfig.setCacheMode(CacheMode.REPLICATED);
        alertsConfig.setAtomicityMode(CacheAtomicityMode.ATOMIC);
        alertsConfig.setWriteSynchronizationMode(CacheWriteSynchronizationMode.FULL_SYNC);
        alertsConfig.setEagerTtl(false);
        alertsConfig.setBackups(1);
        alertsConfig.setRebalanceMode(CacheRebalanceMode.SYNC);
        alertsConfig.setBackups(0);
        alertsConfig.setAtomicityMode(CacheAtomicityMode.ATOMIC);
        alertsConfig.setName("AlertsConfig");
        alertsConfig.setIndexedTypes(String.class,HazelCastConfigEntry.class);*//*

        *//*FifoEvictionPolicy<String,Object> fifoEvictionPolicy = new FifoEvictionPolicy<>();
        fifoEvictionPolicy.setMaxMemorySize(12L * 1024 * 1024 * 1024);*//*

        *//*LruEvictionPolicy fifoEvictionPolicy = new LruEvictionPolicy();
        fifoEvictionPolicy.setBatchSize(10000000);
        fifoEvictionPolicy.setMaxMemorySize(12L * 1024 * 1024 * 1024);
        alertsConfig.setEvictionPolicy(fifoEvictionPolicy);*//*

        igniteConfiguration.setCacheConfiguration(alerts);


        *//*WeightedRandomLoadBalancingSpi loadBalancingSpi = new WeightedRandomLoadBalancingSpi();
        loadBalancingSpi.setName("LoadingBalancing");
        loadBalancingSpi.setNodeWeight(30);
        loadBalancingSpi.setUseWeights(true);

        igniteConfiguration.setLoadBalancingSpi(loadBalancingSpi);*//*

        *//*JobStealingCollisionSpi jobStealingCollisionSpi = new JobStealingCollisionSpi();
        jobStealingCollisionSpi.setActiveJobsThreshold(50);
        jobStealingCollisionSpi.setMaximumStealingAttempts(5);
        jobStealingCollisionSpi.setStealingEnabled(true);
        jobStealingCollisionSpi.setWaitJobsThreshold(0);
        jobStealingCollisionSpi.setMessageExpireTime(1000);
        Map<String,String> stealingAttributes = new HashedMap();
        stealingAttributes.put("node.segment","expertsLevelCache");
        jobStealingCollisionSpi.setStealingAttributes(stealingAttributes);

        igniteConfiguration.setCollisionSpi(jobStealingCollisionSpi);*//*

       *//* final Ignite start = Ignition.start(igniteConfiguration);
        start.active(true);*//*

        return igniteConfiguration;
    }*/


    /*@Bean
    public Ignite ignite(IgniteConfiguration igniteConfiguration) throws IgniteException {
        final Ignite start = Ignition.start(igniteConfiguration);
        start.active(true);
        return start;
    }*/





}
