package com.experts.core.biller.statemachine.api.service.impl.dtos.billpull.response;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PmtConst")
@XmlAccessorType(XmlAccessType.FIELD)
public class BillPullPmtCostResponse {

    @XmlElement(name  = "AllowPart" , required = true)
    private String allowPart;

    @XmlElement(name  = "Lower" , required = true)
    private String lower;

    @XmlElement(name  = "Upper" , required = true)
    private String upper;


    public String getAllowPart() {
        return allowPart;
    }

    public void setAllowPart(String allowPart) {
        this.allowPart = allowPart;
    }

    public String getLower() {
        return lower;
    }

    public void setLower(String lower) {
        this.lower = lower;
    }

    public String getUpper() {
        return upper;
    }

    public void setUpper(String upper) {
        this.upper = upper;
    }
}
