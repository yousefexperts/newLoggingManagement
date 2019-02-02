package com.experts.core.biller.statemachine.api.jms.config;

import com.experts.core.biller.statemachine.api.jms.core.JmsListener;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.listener.DefaultMessageListenerContainer;
import org.springframework.jms.listener.MessageListenerContainer;

import javax.jms.ConnectionFactory;

@Configuration
@ComponentScan
public class JMSAppConfig {
    public static final String QUEUE_NAME = "biller.queue";

    @Bean
    public ConnectionFactory connectionFactory() {
        ConnectionFactory connectionFactory =
                new ActiveMQConnectionFactory("vm://localhost");
        return connectionFactory;
    }

    @Bean
    public MessageListenerContainer listenerContainer() {
        DefaultMessageListenerContainer container = new DefaultMessageListenerContainer();
        container.setConnectionFactory(connectionFactory());
        container.setDestinationName(QUEUE_NAME);
        container.setMessageListener(new JmsListener());
        return container;
    }
}
