package com.experts.core.biller.statemachine.api.activemq.standers.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.transaction.PlatformTransactionManager;

import javax.jms.ConnectionFactory;

@Configuration
@EnableJms
public class MessagingListnerConfiguration {

    @Autowired
    private ConnectionFactory connectionFactory;

    @Autowired
    private PlatformTransactionManager platformTransactionManager;

    @Bean
    public DefaultJmsListenerContainerFactory jmsListenerContainerFactory() {
        DefaultJmsListenerContainerFactory jmsListenerContainerFactory = new DefaultJmsListenerContainerFactory();
        jmsListenerContainerFactory.setConnectionFactory(connectionFactory);
        jmsListenerContainerFactory.setTransactionManager(platformTransactionManager);
        jmsListenerContainerFactory.setConcurrency("1-2");
        jmsListenerContainerFactory.setSessionTransacted(true);
        return jmsListenerContainerFactory;
    }

}
