package com.experts.core.biller.statemachine.api.model.domain.jpa.settlement;


import com.experts.core.biller.statemachine.api.model.domain.jpa.AbstractEntity_;
import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceIndex;
import com.gigaspaces.annotation.pojo.SpacePersist;
import com.gigaspaces.annotation.pojo.SpaceVersion;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name  = "transaction_batch_job")
@SpaceClass
public class TransactionBatchJob extends AbstractEntity_ implements Serializable {

    @Column(name  = "name" , nullable = false)
    private String name;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name   = "success" , nullable = false)
    private boolean isSuccess;

    @Column(name  = "request" , nullable = false)
    private String request;

    @Column(name = "response" , nullable = false)
    private String response;

    @Column(name  = "exception" , nullable = true)
    private String exception;

    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name  = "transaction_id" , nullable = false)
    private TransactionCreation transactionCreation;


    @SpaceIndex
    @SpacePersist
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @SpaceIndex
    @SpacePersist
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @SpaceIndex
    @SpacePersist
    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    @SpaceIndex
    @SpacePersist
    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    @SpaceIndex
    @SpacePersist
    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @SpaceIndex
    @SpacePersist
    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    @SpaceIndex
    @SpacePersist
    public TransactionCreation getTransactionCreation() {
        return transactionCreation;
    }

    public void setTransactionCreation(TransactionCreation transactionCreation) {
        this.transactionCreation = transactionCreation;
    }

    private int version;


    @SpaceVersion
    public int getVersion() {
        return version;
    }

}
