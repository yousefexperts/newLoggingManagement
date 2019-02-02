package com.experts.core.biller.statemachine.api.service.impl.dtos.billpull.request;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MFEP")
@XmlAccessorType(XmlAccessType.FIELD)
public class BillPullMFEP {

    @XmlElement(name  = "MsgHeader" , required = true , type =  BillPullHeader.class)
    private BillPullHeader headers;

    @XmlElement(name = "MsgBody" , required = true , type = BillPullMsgBody.class)
    private BillPullMsgBody msgBody;

    @XmlElement(name  = "MsgFooter" , required = true , type = BillPullMsgFooter.class)
    private BillPullMsgFooter msgFooter;

    public BillPullHeader getHeaders() {
        return headers;
    }

    public void setHeaders(BillPullHeader headers) {
        this.headers = headers;
    }

    public BillPullMsgBody getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(BillPullMsgBody msgBody) {
        this.msgBody = msgBody;
    }

    public BillPullMsgFooter getMsgFooter() {
        return msgFooter;
    }

    public void setMsgFooter(BillPullMsgFooter msgFooter) {
        this.msgFooter = msgFooter;
    }
}
