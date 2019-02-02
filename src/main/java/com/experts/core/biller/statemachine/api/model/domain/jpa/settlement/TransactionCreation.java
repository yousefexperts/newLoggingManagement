package com.experts.core.biller.statemachine.api.model.domain.jpa.settlement;

import com.experts.core.biller.statemachine.api.domain.enumsapi.BillerServiceCatEnum;
import com.experts.core.biller.statemachine.api.model.domain.jpa.AbstractEntity_;
import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceIndex;
import com.gigaspaces.annotation.pojo.SpacePersist;
import com.gigaspaces.annotation.pojo.SpaceVersion;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name  = "transactions_creations")
@SpaceClass
public class TransactionCreation extends AbstractEntity_ implements Serializable {

    @Column(name  = "serial_no" , nullable = false)
    private String serialNo;

    @Column(name  = "creation_date" , nullable = false)
    private Date creationDate;

    @Column(name  = "exception_date" , nullable = true)
    private Date exceptionDate;

    @Column(name  = "description" , nullable = true)
    private String description;

    @Column(name  = "op_type" , nullable = false)
    private BillerServiceCatEnum type;

    @Column(name  = "success" , nullable = false)
    private boolean isSuccess;

    @Column(name  = "request" , nullable = false)
    private String request;

    @Column(name  = "response" , nullable = false)
    private String response;


    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "transactionCreation")
    private List<TransactionApproved> transactionApproveds;

    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "transactionCreation")
    private List<TransactionBatchJob> transactionBatchJobs;

    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "tranx")
    private List<TransactionQueue> transactionQueues;


    @SpaceIndex
    @SpacePersist
    public List<TransactionQueue> getTransactionQueues() {
        return transactionQueues;
    }

    public void setTransactionQueues(List<TransactionQueue> transactionQueues) {
        this.transactionQueues = transactionQueues;
    }

    @SpaceIndex
    @SpacePersist
    public List<TransactionBatchJob> getTransactionBatchJobs() {
        return transactionBatchJobs;
    }

    public void setTransactionBatchJobs(List<TransactionBatchJob> transactionBatchJobs) {
        this.transactionBatchJobs = transactionBatchJobs;
    }

    @SpaceIndex
    @SpacePersist
    public List<TransactionApproved> getTransactionApproveds() {
        return transactionApproveds;
    }

    public void setTransactionApproveds(List<TransactionApproved> transactionApproveds) {
        this.transactionApproveds = transactionApproveds;
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
    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    @SpaceIndex
    @SpacePersist
    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    @SpaceIndex
    @SpacePersist
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @SpaceIndex
    @SpacePersist
    public Date getExceptionDate() {
        return exceptionDate;
    }

    public void setExceptionDate(Date exceptionDate) {
        this.exceptionDate = exceptionDate;
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
    public BillerServiceCatEnum getType() {
        return type;
    }

    public void setType(BillerServiceCatEnum type) {
        this.type = type;
    }

    private int version;


    @SpaceVersion
    public int getVersion() {
        return version;
    }

}
