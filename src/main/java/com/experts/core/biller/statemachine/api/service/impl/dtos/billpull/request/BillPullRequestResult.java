package com.experts.core.biller.statemachine.api.service.impl.dtos.billpull.request;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MsgHeader")
@XmlAccessorType(XmlAccessType.FIELD)
public class BillPullRequestResult {

    @XmlElement(name = "ErrorCode" , required = true)
    private String errorCode;

    @XmlElement(name  = "ErrorDesc" , required = true)
    private String errorDesc;

    @XmlElement(name  = "Severity" , required = true)
    private String Severity;


    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    public String getSeverity() {
        return Severity;
    }

    public void setSeverity(String severity) {
        Severity = severity;
    }
}
