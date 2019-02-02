package com.experts.core.biller.statemachine.api.model.domain.jpa.settlement;


import com.experts.core.biller.statemachine.api.model.domain.jpa.AbstractEntity_;
import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceIndex;
import com.gigaspaces.annotation.pojo.SpacePersist;
import com.gigaspaces.annotation.pojo.SpaceVersion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name  = "mule_esb_integration")
@SpaceClass
public class BillersMuleServices extends AbstractEntity_ implements Serializable {

    @Column(name  = "mule_billpull" , nullable = false)
    private String muleStringUrlBillPull;

    @Column(name  = "mule_payment_notification")
    private String muleStringUrlPaymentNotification;


    @SpacePersist
    @SpaceIndex
    public String getMuleStringUrlBillPull() {
        return muleStringUrlBillPull;
    }

    public void setMuleStringUrlBillPull(String muleStringUrlBillPull) {
        this.muleStringUrlBillPull = muleStringUrlBillPull;
    }

    @SpacePersist
    @SpaceIndex
    public String getMuleStringUrlPaymentNotification() {
        return muleStringUrlPaymentNotification;
    }

    public void setMuleStringUrlPaymentNotification(String muleStringUrlPaymentNotification) {
        this.muleStringUrlPaymentNotification = muleStringUrlPaymentNotification;
    }

    private int version;


    @SpaceVersion
    public int getVersion() {
        return version;
    }

}
