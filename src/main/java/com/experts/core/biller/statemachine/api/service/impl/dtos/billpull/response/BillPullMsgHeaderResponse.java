package com.experts.core.biller.statemachine.api.service.impl.dtos.billpull.response;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "MsgHeader")
@XmlAccessorType(XmlAccessType.FIELD)
public class BillPullMsgHeaderResponse {

    @XmlElement(name  = "TmStp" , required = true)
    private Date tmStp;

    @XmlElement(name  = "GUID" , required = true)
    private String guid;

    @XmlElement(name  = "TrsInfo" , required = true)
    private BillPullTrsInfoResponse billPullTrsInfoResponse;


    @XmlElement(name  = "Result" , required = true)
    private BillPullResultResponse billPullResultResponse;


    public Date getTmStp() {
        return tmStp;
    }

    public void setTmStp(Date tmStp) {
        this.tmStp = tmStp;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public BillPullTrsInfoResponse getBillPullTrsInfoResponse() {
        return billPullTrsInfoResponse;
    }

    public void setBillPullTrsInfoResponse(BillPullTrsInfoResponse billPullTrsInfoResponse) {
        this.billPullTrsInfoResponse = billPullTrsInfoResponse;
    }

    public BillPullResultResponse getBillPullResultResponse() {
        return billPullResultResponse;
    }

    public void setBillPullResultResponse(BillPullResultResponse billPullResultResponse) {
        this.billPullResultResponse = billPullResultResponse;
    }
}
