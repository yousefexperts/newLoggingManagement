package com.experts.core.biller.statemachine.api.soapService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://localhost:3070/payment", name = "PaymentRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentOrderRequest {

    @XmlElement
    private String TrxRefNo;

    @XmlElement
    private String CustIDCode;

    @XmlElement
    private String OTP;

    @XmlElement
    private String CustIDNo;

    @XmlElement
    private String OTPRefNo;

    @XmlElement
    private String Transactions;

    @XmlElement
    private String TrxInf;

    @XmlElement
    private String AcctInfo;

    @XmlElement
    private String BillingNo;

    @XmlElement
    private String BillNo;

    @XmlElement
    private String BillerCode;

    @XmlElement
    private String PmtType;

    @XmlElement
    private String InqRefNo;

    @XmlElement
    private String ValidationCode;

    @XmlElement
    private String DueAmt;

    @XmlElement
    private String PaidAmt;

    @XmlElement
    private String FeesAmt;

    @XmlElement
    private String Currency;

    @XmlElement
    private String AccessChannel;

    @XmlElement
    private String PaymentMethod;

    @XmlElement
    private String ServiceTypeDetails;

    @XmlElement
    private String ServiceType;

    @XmlElement
    private String PrepaidCat;

    @XmlElement
    private String StatementNarrative;

    @XmlElement
    private String ExtraInfo;

    public String getTrxRefNo() {
        return TrxRefNo;
    }

    public void setTrxRefNo(String trxRefNo) {
        TrxRefNo = trxRefNo;
    }

    public String getCustIDCode() {
        return CustIDCode;
    }

    public void setCustIDCode(String custIDCode) {
        CustIDCode = custIDCode;
    }

    public String getOTP() {
        return OTP;
    }

    public void setOTP(String OTP) {
        this.OTP = OTP;
    }

    public String getCustIDNo() {
        return CustIDNo;
    }

    public void setCustIDNo(String custIDNo) {
        CustIDNo = custIDNo;
    }

    public String getOTPRefNo() {
        return OTPRefNo;
    }

    public void setOTPRefNo(String OTPRefNo) {
        this.OTPRefNo = OTPRefNo;
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

    public String getPmtType() {
        return PmtType;
    }

    public void setPmtType(String pmtType) {
        PmtType = pmtType;
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

    public String getFeesAmt() {
        return FeesAmt;
    }

    public void setFeesAmt(String feesAmt) {
        FeesAmt = feesAmt;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public String getAccessChannel() {
        return AccessChannel;
    }

    public void setAccessChannel(String accessChannel) {
        AccessChannel = accessChannel;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        PaymentMethod = paymentMethod;
    }

    public String getServiceTypeDetails() {
        return ServiceTypeDetails;
    }

    public void setServiceTypeDetails(String serviceTypeDetails) {
        ServiceTypeDetails = serviceTypeDetails;
    }

    public String getServiceType() {
        return ServiceType;
    }

    public void setServiceType(String serviceType) {
        ServiceType = serviceType;
    }

    public String getPrepaidCat() {
        return PrepaidCat;
    }

    public void setPrepaidCat(String prepaidCat) {
        PrepaidCat = prepaidCat;
    }

    public String getStatementNarrative() {
        return StatementNarrative;
    }

    public void setStatementNarrative(String statementNarrative) {
        StatementNarrative = statementNarrative;
    }

    public String getExtraInfo() {
        return ExtraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        ExtraInfo = extraInfo;
    }
}
