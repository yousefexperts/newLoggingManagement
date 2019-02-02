package com.experts.core.biller.statemachine.api.order;

import com.experts.core.biller.statemachine.api.constants.TransactionEventType;
import com.experts.core.biller.statemachine.api.model.domain.jpa.Payment;
import com.experts.core.biller.statemachine.api.model.domain.jpa.Transaction;
import com.experts.core.biller.statemachine.api.model.domain.jpa.TransactionStatus;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineFactory;
import org.springframework.statemachine.support.DefaultStateMachineContext;

public class DefaultTransactionState implements TransactionStateMachineFactory {

    private StateMachineFactory<TransactionStatusType, TransactionEventType> factory;

    public DefaultTransactionState(
            StateMachineFactory<TransactionStatusType, TransactionEventType> factory) {
        this.factory = factory;
    }

    @Override
    public TransactionStateMachine createBy(Payment payment) {
        return this.createBy(payment.getTransaction());
    }

    @Override
    public TransactionStateMachine createBy(Transaction transaction) {

        StateMachine<TransactionStatusType, TransactionEventType> machine = factory.getStateMachine();

        TransactionStatus status = transaction.getStatus();

        machine.getStateMachineAccessor().withAllRegions().stream().forEach((r) -> {
            r.resetStateMachine(new DefaultStateMachineContext<>(status.asType(), null, null, null));
        });

        machine.getExtendedState().getVariables().put("transaction", transaction);
        machine.start();

        return null;

    }
}
