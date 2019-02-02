package com.experts.core.biller.statemachine.api.service.impl.dtos.billpull.response;


import com.experts.core.biller.statemachine.api.service.impl.dtos.billpull.request.BillPullMsgFooter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MFEP")
@XmlAccessorType(XmlAccessType.FIELD)
public class BillPullMFEPResponse
{

    @XmlElement(name  = "MsgHeader" , required = true)
    private BillPullMsgHeaderResponse billPullMsgHeaderResponse;

    @XmlElement(name = "MsgBody" , required = true)
    private BillPullResponseMsgBody billPullResponseMsgBody;

    @XmlElement(name  = "MsgFooter" , required = true)
    private BillPullMsgFooter billPullMsgFooter;

    public BillPullMsgHeaderResponse getBillPullMsgHeaderResponse() {
        return billPullMsgHeaderResponse;
    }

    public void setBillPullMsgHeaderResponse(BillPullMsgHeaderResponse billPullMsgHeaderResponse) {
        this.billPullMsgHeaderResponse = billPullMsgHeaderResponse;
    }

    public BillPullResponseMsgBody getBillPullResponseMsgBody() {
        return billPullResponseMsgBody;
    }

    public void setBillPullResponseMsgBody(BillPullResponseMsgBody billPullResponseMsgBody) {
        this.billPullResponseMsgBody = billPullResponseMsgBody;
    }

    public BillPullMsgFooter getBillPullMsgFooter() {
        return billPullMsgFooter;
    }

    public void setBillPullMsgFooter(BillPullMsgFooter billPullMsgFooter) {
        this.billPullMsgFooter = billPullMsgFooter;
    }
}
