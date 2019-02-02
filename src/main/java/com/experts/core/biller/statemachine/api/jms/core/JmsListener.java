package com.experts.core.biller.statemachine.api.jms.core;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class JmsListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        if (message instanceof TextMessage) {
            try {
                String text = ((TextMessage) message).getText();
                System.out.println("received: " + text);
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }
}
