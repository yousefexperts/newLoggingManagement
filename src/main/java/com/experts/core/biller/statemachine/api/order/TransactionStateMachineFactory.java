package com.experts.core.biller.statemachine.api.order;

import com.experts.core.biller.statemachine.api.model.domain.jpa.Payment;
import com.experts.core.biller.statemachine.api.model.domain.jpa.Transaction;

public interface TransactionStateMachineFactory {

    public TransactionStateMachine createBy(Transaction transaction);

    public TransactionStateMachine createBy(Payment payment);
}