package com.experts.core.biller.statemachine.api.service.impl.dtos.billpull.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AcctInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class AcctInfo {

    @XmlElement(name = "BillingNo" , required = true)
    private String billingNo;

    @XmlElement(name = "BillNo" , required = true)
    private String billNo;

    public String getBillingNo() {
        return billingNo;
    }

    public void setBillingNo(String billingNo) {
        this.billingNo = billingNo;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }
}
