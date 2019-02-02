package com.experts.core.biller.statemachine.api.model.domain.jpa;

import javax.persistence.*;

import com.experts.core.biller.statemachine.api.model.EntityRevisionListener_;
import com.gigaspaces.annotation.pojo.SpaceClass;


@Entity
@Table(name = "Payments")
@EntityListeners({EntityRevisionListener_.class})
@SpaceClass
public abstract class Payment extends AbstractEntity_{



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transaction_id" , nullable = false)
    private Transaction transaction;

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public boolean isWaitingPay() {
        return this.getStatus().isWaitingPay();
    }

    public boolean isPaid() {
        return this.getStatus().isPaid();
    }

    public boolean isCancelled() {
        return this.getStatus().isCancelled();
    }

    public abstract <S extends PaymentStatus> S getStatus();

}
