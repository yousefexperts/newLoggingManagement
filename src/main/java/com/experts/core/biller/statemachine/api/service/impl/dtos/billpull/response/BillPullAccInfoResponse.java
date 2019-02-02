package com.experts.core.biller.statemachine.api.service.impl.dtos.billpull.response;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "AccInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class BillPullAccInfoResponse {

    @XmlElement(name  = "BillingNo" , required = true)
    private String billingInfo;

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



}
