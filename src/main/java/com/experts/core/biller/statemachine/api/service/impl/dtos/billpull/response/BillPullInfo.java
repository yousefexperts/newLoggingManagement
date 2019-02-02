package com.experts.core.biller.statemachine.api.service.impl.dtos.billpull.response;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "BillRec")
@XmlAccessorType(XmlAccessType.FIELD)
public class BillPullInfo {

    @XmlElement(name  = "AccInfo" , required = true)
    private BillPullAccInfoResponse billPullAccInfoResponse;

    @XmlElement(name  = "BillStatus" , required = true)
    private String billStatus;

    @XmlElement(name  = "DueAmount" , required = true)
    private String dueAmount;

    @XmlElement(name = "IssueDate" , required = true , type = Date.class)
    private Date issueDate;

    @XmlElement(name = "DueDate" , required = true , type = Date.class)
    private Date dueDate;

    @XmlElement(name  = "ServiceType" , required = true)
    private String serviceType;

    @XmlElement(name  = "PmtCost" , required = true)
    private  BillPullPmtCostResponse billPullPmtCostResponse;


    public BillPullAccInfoResponse getBillPullAccInfoResponse() {
        return billPullAccInfoResponse;
    }

    public void setBillPullAccInfoResponse(BillPullAccInfoResponse billPullAccInfoResponse) {
        this.billPullAccInfoResponse = billPullAccInfoResponse;
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    public String getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(String dueAmount) {
        this.dueAmount = dueAmount;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public BillPullPmtCostResponse getBillPullPmtCostResponse() {
        return billPullPmtCostResponse;
    }

    public void setBillPullPmtCostResponse(BillPullPmtCostResponse billPullPmtCostResponse) {
        this.billPullPmtCostResponse = billPullPmtCostResponse;
    }
}
