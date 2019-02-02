package com.experts.core.biller.statemachine.api.activemq.standers.config;

import com.atomikos.icatch.jta.UserTransactionManager;

import javax.transaction.SystemException;
import javax.transaction.TransactionManager;

public class DistTxManagerProvider {
    private static DistTxManagerProvider distTxManagerProvider = null;
    private TransactionManager transactionManager;

    protected DistTxManagerProvider() {
        try {
            UserTransactionManager utm = new UserTransactionManager();
            utm.init();
            this.transactionManager = utm;
        } catch (SystemException e) {
            System.out.println("Error " + e);
        }
    }

    public static DistTxManagerProvider getInstance() {
        if (distTxManagerProvider == null) {
            synchronized (DistTxManagerProvider.class) {
                if (distTxManagerProvider == null) {
                    distTxManagerProvider = new DistTxManagerProvider();
                }
            }
        }
        return distTxManagerProvider;
    }

    public TransactionManager getTransactionManager() {
        return this.transactionManager;
    }
}
