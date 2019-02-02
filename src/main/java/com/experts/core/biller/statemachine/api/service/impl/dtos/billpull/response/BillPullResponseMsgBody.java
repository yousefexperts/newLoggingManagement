package com.experts.core.biller.statemachine.api.service.impl.dtos.billpull.response;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MsgBody")
@XmlAccessorType(XmlAccessType.FIELD)
public class BillPullResponseMsgBody {

    @XmlElement(name  = "RecCount" , required = true)
    private String recCount;

    @XmlElement(name  = "BillRecs" , required = true)
    private BillPullInfos billPullInfos;


    public String getRecCount() {
        return recCount;
    }

    public void setRecCount(String recCount) {
        this.recCount = recCount;
    }

    public BillPullInfos getBillPullInfos() {
        return billPullInfos;
    }

    public void setBillPullInfos(BillPullInfos billPullInfos) {
        this.billPullInfos = billPullInfos;
    }
}
