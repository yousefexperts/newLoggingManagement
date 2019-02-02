package com.experts.core.biller.statemachine.api.soapService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://www.experts-payment.com/payment", name = "PaymentOrderResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentOrderResponse {

    private String Result;
    private String PmtType;
    private String Severity;
    private String TrxRefNo;
    private String CustIDNo;
    private String idType;
    private String Transactions;
    private String TrxInf;
    private String ErrorCode;
    private String AcctInfo;
    private String BillingNo;
    private String BillNo;
    private String BillerCode;
    private String InqRefNo;
    private String ValidationCode;
    private String DueAmt;
    private String PaidAmt;
    private String ExtraInfo;

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }

    public String getPmtType() {
        return PmtType;
    }

    public void setPmtType(String pmtType) {
        PmtType = pmtType;
    }

    public String getSeverity() {
        return Severity;
    }

    public void setSeverity(String severity) {
        Severity = severity;
    }

    public String getTrxRefNo() {
        return TrxRefNo;
    }

    public void setTrxRefNo(String trxRefNo) {
        TrxRefNo = trxRefNo;
    }

    public String getCustIDNo() {
        return CustIDNo;
    }

    public void setCustIDNo(String custIDNo) {
        CustIDNo = custIDNo;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getTransactions() {
        return Transactions;
    }

    public void setTransactions(String transactions) {
        Transactions = transactions;
    }

    public String getTrxInf() {
        return TrxInf;
    }

    public void setTrxInf(String trxInf) {
        TrxInf = trxInf;
    }

    public String getErrorCode() {
        return ErrorCode;
    }

    public void setErrorCode(String errorCode) {
        ErrorCode = errorCode;
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

    public String getBillNo() {
        return BillNo;
    }

    public void setBillNo(String billNo) {
        BillNo = billNo;
    }

    public String getBillerCode() {
        return BillerCode;
    }

    public void setBillerCode(String billerCode) {
        BillerCode = billerCode;
    }

    public String getInqRefNo() {
        return InqRefNo;
    }

    public void setInqRefNo(String inqRefNo) {
        InqRefNo = inqRefNo;
    }

    public String getValidationCode() {
        return ValidationCode;
    }

    public void setValidationCode(String validationCode) {
        ValidationCode = validationCode;
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

    public String getExtraInfo() {
        return ExtraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        ExtraInfo = extraInfo;
    }
}
