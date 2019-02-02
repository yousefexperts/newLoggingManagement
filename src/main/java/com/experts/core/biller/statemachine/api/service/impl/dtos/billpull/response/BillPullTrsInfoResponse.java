package com.experts.core.biller.statemachine.api.service.impl.dtos.billpull.response;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TrsInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class BillPullTrsInfoResponse {


    @XmlElement(name  = "SdrCode" , required = true)
    private String sdrCode;

    @XmlElement(name  = "ResTyp" , required = true)
    private String resType;

    public String getSdrCode() {
        return sdrCode;
    }

    public void setSdrCode(String sdrCode) {
        this.sdrCode = sdrCode;
    }

    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        this.resType = resType;
    }
}
