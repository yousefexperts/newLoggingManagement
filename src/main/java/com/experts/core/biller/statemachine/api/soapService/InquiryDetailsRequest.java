package com.experts.core.biller.statemachine.api.soapService;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;



@XmlRootElement(namespace = "http://www.experts.ps/ws/inquiry", name = "UserRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class InquiryDetailsRequest {

    @XmlElement
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}