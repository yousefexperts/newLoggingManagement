package com.experts.core.biller.statemachine.api.activemq.standers.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import java.util.Properties;
import javax.annotation.PostConstruct;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.XAConnection;
import javax.jms.XAConnectionFactory;
import javax.jms.XASession;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.transaction.Transaction;
import javax.transaction.xa.XAResource;

@Configuration
@Component
public class XAPublisherTemplate {
    public static final String NAMING_FACTORY_INITIAL = "java.naming.factory.initial";

    public static final String PROVIDER_URL = "java.naming.provider.url";

    public static final String TOPIC_PREFIX = "topic.";

    public static final String QUEUE_PREFIX = "queue.";

    private static final String connectionFac = "XAConnectionFactory";

    private static final String queueName = "MyXAQueue";

    private static final String url = "tcp://localhost:61616";

    private static final String broker = "org.apache.activemq.jndi.ActiveMQInitialContextFactory";


    @PostConstruct
    public void xaManagerPublish() throws Exception {
        InitialContext initialContext = getInitialContext();
        XAConnectionFactory connectionFactory = (XAConnectionFactory) initialContext.lookup(connectionFac);
        Destination xaTestQueue = (Destination) initialContext.lookup(queueName);
        XAConnection xaConnection = connectionFactory.createXAConnection();
        xaConnection.start();
        XASession xaSession = xaConnection.createXASession();
        XAResource xaResource = xaSession.getXAResource();
        DistTxManagerProvider distTxManagerProvider = DistTxManagerProvider.getInstance();
        distTxManagerProvider.getTransactionManager().begin();
        Transaction transaction = distTxManagerProvider.getTransactionManager().getTransaction();
        transaction.enlistResource(xaResource);
        Session session = xaSession.getSession();
        MessageProducer producer = session.createProducer(xaTestQueue);
        producer.send(session.createTextMessage("BillerCommingUp"));
        distTxManagerProvider.getTransactionManager().rollback();

    }

    private static InitialContext getInitialContext() throws NamingException {
        Properties properties = new Properties();
        properties.put(NAMING_FACTORY_INITIAL, broker);
        properties.put(PROVIDER_URL, url);
        properties.put(QUEUE_PREFIX + queueName, queueName);
        return new InitialContext(properties);
    }

}