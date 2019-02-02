package com.experts.core.biller.statemachine.api.model.domain.jpa;

import com.experts.core.biller.statemachine.api.order.TransactionStatusType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TransactionStatus extends AbstractEntity_ {


    private TransactionStatusType status;


    public TransactionStatus() {
    }

    public TransactionStatus(TransactionStatusType status) {
        this.status = status;
    }

    public TransactionStatusType asType() {
        return status;
    }

    public void waitingPay() {
        status = TransactionStatusType.WAITING_PAY;
    }

    public void paid() {
        status = TransactionStatusType.PAID;
    }

    public void cancelled() {
        status = TransactionStatusType.CANCELLED;
    }

    public static TransactionStatus created() {
        return new TransactionStatus(TransactionStatusType.CREATED);
    }

}