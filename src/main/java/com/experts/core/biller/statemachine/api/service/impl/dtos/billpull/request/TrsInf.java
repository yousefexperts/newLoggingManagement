package com.experts.core.biller.statemachine.api.service.impl.dtos.billpull.request;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TrsInf")
@XmlAccessorType(XmlAccessType.FIELD)
public class TrsInf {

    @XmlElement(name  = "SdrCode" , required = true)
    private String sdrCode;

    @XmlElement(name  = "RcvCode" , required = true)
    private String rcvCode;

    @XmlElement(name  = "ReqTyp" , required = true)
    private String reqTyp;

    public String getSdrCode() {
        return sdrCode;
    }

    public void setSdrCode(String sdrCode) {
        this.sdrCode = sdrCode;
    }

    public String getRcvCode() {
        return rcvCode;
    }

    public void setRcvCode(String rcvCode) {
        this.rcvCode = rcvCode;
    }

    public String getReqTyp() {
        return reqTyp;
    }

    public void setReqTyp(String reqTyp) {
        this.reqTyp = reqTyp;
    }
}
