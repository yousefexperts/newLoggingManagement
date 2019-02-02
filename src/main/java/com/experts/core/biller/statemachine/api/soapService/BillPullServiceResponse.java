package com.experts.core.biller.statemachine.api.soapService;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://www.experts.ps/ws/billpull", name = "BillPullResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class BillPullServiceResponse {

    @XmlElement
    private String resCount;

    @XmlElement
    private String billRec;

    @XmlElement
    private String billingNo;

    @XmlElement
    private String billNo;

    @XmlElement
    private String result;

    @XmlElement
    private String errorCode;

    @XmlElement
    private String errorDesc;

    @XmlElement
    private String serverity;

    @XmlElement
    private String accInfo;

    @XmlElement
    private String billStatus;

    @XmlElement
    private String dueAmount;

    @XmlElement
    private String currency;

    @XmlElement
    private String issueDate;

    @XmlElement
    private String openDate;

    @XmlElement
    private String dueDate;

    @XmlElement
    private String expiryDate;

    @XmlElement
    private String closeDate;

    @XmlElement
    private String serviceType;

    @XmlElement
    private String billType;

    @XmlElement
    private String pmtConst;

    @XmlElement
    private String allowPart;

    @XmlElement
    private String lower;

    @XmlElement
    private String upper;

    @XmlElement
    private String subPmts;

    @XmlElement
    private String subPmt;

    @XmlElement
    private String amount;

    @XmlElement
    private String bankCode;

    @XmlElement
    private String accNo;

    public String getResCount() {
        return resCount;
    }

    public void setResCount(String resCount) {
        this.resCount = resCount;
    }

    public String getBillRec() {
        return billRec;
    }

    public void setBillRec(String billRec) {
        this.billRec = billRec;
    }

    public String getBillingNo() {
        return billingNo;
    }

    public void setBillingNo(String billingNo) {
        this.billingNo = billingNo;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

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

    public String getServerity() {
        return serverity;
    }

    public void setServerity(String serverity) {
        this.serverity = serverity;
    }

    public String getAccInfo() {
        return accInfo;
    }

    public void setAccInfo(String accInfo) {
        this.accInfo = accInfo;
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

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getPmtConst() {
        return pmtConst;
    }

    public void setPmtConst(String pmtConst) {
        this.pmtConst = pmtConst;
    }

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

    public String getSubPmts() {
        return subPmts;
    }

    public void setSubPmts(String subPmts) {
        this.subPmts = subPmts;
    }

    public String getSubPmt() {
        return subPmt;
    }

    public void setSubPmt(String subPmt) {
        this.subPmt = subPmt;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }
}
