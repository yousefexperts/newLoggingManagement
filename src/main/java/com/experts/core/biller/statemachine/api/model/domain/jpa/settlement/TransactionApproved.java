package com.experts.core.biller.statemachine.api.model.domain.jpa.settlement;


import com.experts.core.biller.statemachine.api.model.domain.jpa.AbstractEntity_;
import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceIndex;
import com.gigaspaces.annotation.pojo.SpacePersist;
import com.gigaspaces.annotation.pojo.SpaceVersion;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name  = "transactions_approved")
@SpaceClass
public class TransactionApproved extends AbstractEntity_ implements Serializable {

    @Column(name  = "approved" , nullable = false)
    private boolean approved;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "transaction_id" , nullable = false)
    private TransactionCreation transactionCreation;

    @Column(name  = "description" , nullable = false)
    private String description;


    @SpaceIndex
    @SpacePersist
    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    @SpaceIndex
    @SpacePersist
    public TransactionCreation getTransactionCreation() {
        return transactionCreation;
    }

    public void setTransactionCreation(TransactionCreation transactionCreation) {
        this.transactionCreation = transactionCreation;
    }

    @SpaceIndex
    @SpacePersist
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private int version;


    @SpaceVersion
    public int getVersion() {
        return version;
    }

}
