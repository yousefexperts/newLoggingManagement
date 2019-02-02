package com.experts.core.biller.statemachine.api.soapService;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://localhost:3070/prepaid", name = "PrePaidRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class PrePaidServiceRequest {
    @XmlElement
   private String TrxInf;

    @XmlElement
   private String AcctInfo;

    @XmlElement
   private String BillingNo;

    @XmlElement
   private String BillerCode;

    @XmlElement
   private String BankTrxID;

    @XmlElement
   private String ValidationCode;

    @XmlElement
   private String PmtStatus;

    @XmlElement
   private String DueAmt;

    @XmlElement
   private String PaidAmt;

    @XmlElement
   private String ProcessDate;

    @XmlElement
   private String Currency;

    @XmlElement
   private String STMTDate;

    @XmlElement
   private String JOEBPPSTrx;

    @XmlElement
   private String Result;

    @XmlElement
   private String ErrorCode;

    @XmlElement
   private String ErrorDesc;

    @XmlElement
   private String Severity;


    public String getTrxInf() {
        return TrxInf;
    }

    public void setTrxInf(String trxInf) {
        TrxInf = trxInf;
    }

    public String getAcctInfo() {
        return AcctInfo;
    }

    public void setAcctInfo(String acctInfo) {
        AcctInfo = acctInfo;
    }

    public String getBillingNo() {
        return BillingNo;
    }

    public void setBillingNo(String billingNo) {
        BillingNo = billingNo;
    }

    public String getBillerCode() {
        return BillerCode;
    }

    public void setBillerCode(String billerCode) {
        BillerCode = billerCode;
    }

    public String getBankTrxID() {
        return BankTrxID;
    }

    public void setBankTrxID(String bankTrxID) {
        BankTrxID = bankTrxID;
    }

    public String getValidationCode() {
        return ValidationCode;
    }

    public void setValidationCode(String validationCode) {
        ValidationCode = validationCode;
    }

    public String getPmtStatus() {
        return PmtStatus;
    }

    public void setPmtStatus(String pmtStatus) {
        PmtStatus = pmtStatus;
    }

    public String getDueAmt() {
        return DueAmt;
    }

    public void setDueAmt(String dueAmt) {
        DueAmt = dueAmt;
    }

    public String getPaidAmt() {
        return PaidAmt;
    }

    public void setPaidAmt(String paidAmt) {
        PaidAmt = paidAmt;
    }

    public String getProcessDate() {
        return ProcessDate;
    }

    public void setProcessDate(String processDate) {
        ProcessDate = processDate;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public String getSTMTDate() {
        return STMTDate;
    }

    public void setSTMTDate(String STMTDate) {
        this.STMTDate = STMTDate;
    }

    public String getJOEBPPSTrx() {
        return JOEBPPSTrx;
    }

    public void setJOEBPPSTrx(String JOEBPPSTrx) {
        this.JOEBPPSTrx = JOEBPPSTrx;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }

    public String getErrorCode() {
        return ErrorCode;
    }

    public void setErrorCode(String errorCode) {
        ErrorCode = errorCode;
    }

    public String getErrorDesc() {
        return ErrorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        ErrorDesc = errorDesc;
    }

    public String getSeverity() {
        return Severity;
    }

    public void setSeverity(String severity) {
        Severity = severity;
    }
}
