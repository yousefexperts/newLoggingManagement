package com.experts.core.biller.statemachine.api.service.impl.dtos.billpull.request;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MsgFooter")
@XmlAccessorType(XmlAccessType.FIELD)
public class BillPullMsgFooter {

    @XmlElement(name  = "Signature" , required = true)
    private BillPullSignature signature;

    public BillPullSignature getSignature() {
        return signature;
    }

    public void setSignature(BillPullSignature signature) {
        this.signature = signature;
    }
}
