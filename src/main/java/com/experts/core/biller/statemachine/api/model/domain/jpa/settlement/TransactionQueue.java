package com.experts.core.biller.statemachine.api.model.domain.jpa.settlement;


import com.experts.core.biller.statemachine.api.model.domain.jpa.AbstractEntity_;
import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceIndex;
import com.gigaspaces.annotation.pojo.SpacePersist;
import com.gigaspaces.annotation.pojo.SpaceVersion;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name  = "transaction_queue")
@SpaceClass
public class TransactionQueue extends AbstractEntity_ implements Serializable {


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "transaction_id" , nullable = false)
    private TransactionCreation tranx;

    @Column(name  = "create_date" , nullable = false)
    private Date createDate;

    @Column(name  = "success" , nullable = false)
    private boolean isSuccess;


    @SpaceIndex
    @SpacePersist
    public TransactionCreation getTranx() {
        return tranx;
    }

    public void setTranx(TransactionCreation tranx) {
        this.tranx = tranx;
    }

    @SpaceIndex
    @SpacePersist
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @SpaceIndex
    @SpacePersist
    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    private int version;


    @SpaceVersion
    public int getVersion() {
        return version;
    }
}
