package com.experts.core.biller.statemachine.api.service.impl.dtos.billpull.response;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BillsRecs")
@XmlAccessorType(XmlAccessType.FIELD)
public class BillPullInfos {


    @XmlElement(name  = "BillRec" , required = true)
    private BillPullInfo billPullInfo;


    public BillPullInfo getBillPullInfo() {
        return billPullInfo;
    }

    public void setBillPullInfo(BillPullInfo billPullInfo) {
        this.billPullInfo = billPullInfo;
    }
}
