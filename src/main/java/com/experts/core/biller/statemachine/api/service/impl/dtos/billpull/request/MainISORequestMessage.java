package com.experts.core.biller.statemachine.api.service.impl.dtos.billpull.request;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BillPullRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class MainISORequestMessage {

    @XmlElement(name = "MFEP" , required = true , type = BillPullMFEP.class)
    private BillPullMFEP billPullMFEP;


    public BillPullMFEP getBillPullMFEP() {
        return billPullMFEP;
    }

    public void setBillPullMFEP(BillPullMFEP billPullMFEP) {
        this.billPullMFEP = billPullMFEP;
    }
}
