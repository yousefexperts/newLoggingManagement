package com.experts.core.biller.statemachine.api.service.impl.dtos.billpull.request;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MsgBody")
@XmlAccessorType(XmlAccessType.FIELD)
public class BillPullMsgBody {

    @XmlElement(name  = "AcctInfo" , required = true)
    private AcctInfo acctInfo;

    @XmlElement(name  = "ServiceType" , required = true)
    private String serviceType;


    public AcctInfo getAcctInfo() {
        return acctInfo;
    }

    public void setAcctInfo(AcctInfo acctInfo) {
        this.acctInfo = acctInfo;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
