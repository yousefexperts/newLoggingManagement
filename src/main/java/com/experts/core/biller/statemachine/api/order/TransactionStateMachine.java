package com.experts.core.biller.statemachine.api.order;

public interface TransactionStateMachine {

    public static final String TRANSACTION_STATE_MACHINE_NAME = "billerCoreEngineFSM";

    public TransactionStatusType getCurrentState();

    public void waitingPay();

    public void paid();

    public void cancelled();
}