package com.experts.core.biller.statemachine.api.activemq.standers.config;

import org.hibernate.engine.transaction.jta.platform.internal.AbstractJtaPlatform;
import org.springframework.transaction.jta.JtaTransactionManager;
import org.springframework.util.Assert;

import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;

public class AtomikFactoryBean extends AbstractJtaPlatform {

	static TransactionManager sTransactionManager;
	static UserTransaction sUserTransaction;

	@Override
	protected TransactionManager locateTransactionManager() {
		Assert.notNull(sTransactionManager, "TransactionManager has not been setted!!");
		return sTransactionManager;
	}

	@Override
	protected UserTransaction locateUserTransaction() {
		Assert.notNull(sUserTransaction, "UserTransaction has not been setted!!");
		return sUserTransaction;
	}

	public static void setJtaTransactionManager(JtaTransactionManager jtaTransactionManager) {
		sTransactionManager = jtaTransactionManager.getTransactionManager();
		sUserTransaction = jtaTransactionManager.getUserTransaction();
	}

	public static void setTransactionManager(TransactionManager transactionManager) {
		sTransactionManager = transactionManager;
	}

	public static void setUserTransaction(UserTransaction userTransaction) {
		sUserTransaction = userTransaction;
	}
}
