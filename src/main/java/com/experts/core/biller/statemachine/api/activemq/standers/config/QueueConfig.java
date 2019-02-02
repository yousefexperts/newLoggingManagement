package com.experts.core.biller.statemachine.api.activemq.standers.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.store.PersistenceAdapter;
import org.apache.activemq.store.jdbc.JDBCPersistenceAdapter;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.listener.DefaultMessageListenerContainer;
import org.springframework.jms.listener.adapter.MessageListenerAdapter;

import javax.jms.ConnectionFactory;

@EnableAutoConfiguration(exclude = { ActiveMQAutoConfiguration.class })
@Configuration
public class QueueConfig {

    public static final String NAME_METHOD_RUN_QUEUE = "receiverMessage";
    public static final String NAME_DESTINATION_QUEUE = "ActiveMQ.Advisory.TempTopic";
    private static final String MASTER_URL = "vm://localhost";

    @Autowired
    private ConnectionFactory connectionFactory;

    @Bean
    public MessageListenerAdapter requestMessageListener() {
        MessageListenerAdapter messageListener = new MessageListenerAdapter();
        messageListener.setDefaultListenerMethod(QueueConfig.NAME_METHOD_RUN_QUEUE);
        return messageListener;
    }

    public CachingConnectionFactory connectionFactory(ActiveMQConnectionFactory connectionFactory) {
        CachingConnectionFactory factory = new CachingConnectionFactory(connectionFactory);
        return factory;
    }

    @Bean
    public DefaultMessageListenerContainer requestMessageListenerContainer() {
        DefaultMessageListenerContainer requestMessageListenerContainer = new DefaultMessageListenerContainer();
        requestMessageListenerContainer.setConnectionFactory(this.connectionFactory);
        requestMessageListenerContainer.setMessageListener(this.requestMessageListener());
        requestMessageListenerContainer.setSessionTransacted(true);
        requestMessageListenerContainer.setDestinationName(QueueConfig.NAME_DESTINATION_QUEUE);
        return requestMessageListenerContainer;
    }

    @Bean(name = "connectionFactory_")
    public ConnectionFactory connectionFactory() {
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(QueueConfig.MASTER_URL);
        return connectionFactory;
    }

    @Bean
    public JmsTemplate jmsTemplate() {
        JmsTemplate jmsTemplate = new JmsTemplate(this.connectionFactory);
        jmsTemplate.setDefaultDestinationName(QueueConfig.NAME_DESTINATION_QUEUE);
        return jmsTemplate;
    }


    //Persistence Oracle
    @Bean
    public PersistenceAdapter jdbcPersistenceAdapter() {
        final BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        basicDataSource.setUrl("jdbc:oracle:thin:@192.168.10.9:1251/dv10g");
        basicDataSource.setUsername("billmain");
        basicDataSource.setPassword("billmain");
        basicDataSource.setMaxTotal(200);
        basicDataSource.setPoolPreparedStatements(true);
        final JDBCPersistenceAdapter jdbcPersistenceAdapter = new JDBCPersistenceAdapter();
        jdbcPersistenceAdapter.setDataSource(basicDataSource);
        jdbcPersistenceAdapter.setDataDirectory("${activemq.base}/data");
        return jdbcPersistenceAdapter;
    }
}
