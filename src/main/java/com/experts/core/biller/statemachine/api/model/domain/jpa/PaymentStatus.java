package com.experts.core.biller.statemachine.api.model.domain.jpa;

import javax.persistence.*;

import com.experts.core.biller.statemachine.api.constants.PaymentStatusType;
import com.experts.core.biller.statemachine.api.model.EntityRevisionListener_;
import com.gigaspaces.annotation.pojo.*;
import lombok.Data;

@Entity
@Data
@Table(name  = "payment_status")
@EntityListeners({EntityRevisionListener_.class})
@SpaceClass
public abstract class PaymentStatus {


    private int version;

    @SpaceVersion
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @SpaceId
    @SpaceIndex
    @SpacePersist
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    @Column(length = 3072)

    private String id;

    public abstract <S extends PaymentStatusType> S asType();

    public abstract boolean isWaitingPay();

    public abstract boolean isPaid();

    public abstract boolean isCancelled();

}