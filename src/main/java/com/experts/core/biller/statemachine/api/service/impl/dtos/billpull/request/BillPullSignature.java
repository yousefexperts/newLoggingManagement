package com.experts.core.biller.statemachine.api.service.impl.dtos.billpull.request;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MsgHeader")
@XmlAccessorType(XmlAccessType.FIELD)
public class BillPullSignature {

    @XmlElement(name = "Security" , required =  true)
    private String security;

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }
}
