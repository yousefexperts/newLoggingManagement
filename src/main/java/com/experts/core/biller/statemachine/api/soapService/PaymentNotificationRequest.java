package com.experts.core.biller.statemachine.api.soapService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://localhost:3070/notification", name = "PaymentNotificationRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentNotificationRequest {

    @XmlElement
    private String transactions;

    @XmlElement
    private String trxInf;

    @XmlElement
    private String acctInfo;

    @XmlElement
    private String billNo;

    @XmlElement
    private String billingNo;

    @XmlElement
    private String billerCode;

    @XmlElement
    private String JOEBPPSTrx;

    @XmlElement
    private String BankTrxID;

    @XmlElement
    private String billStatus;

    @XmlElement
    private String PmtSrc;

    @XmlElement
    private String BankCode;

    @XmlElement
    private String PmtStatus;

    @XmlElement
    private String DueAmt;

    @XmlElement
    private String PaidAmt;

    @XmlElement
    private String FeesAmt;

    @XmlElement
    private String FeesOnBiller;

    @XmlElement
    private String ProcessDate;

    @XmlElement
    private String STMTDate;

    @XmlElement
    private String AccessChannel;

    @XmlElement
    private String PaymentMethod;

    @XmlElement
    private String ServiceType;

    @XmlElement
    private String SubPmts;

    @XmlElement
    private String subPmt;

    @XmlElement
    private String Amount;

    @XmlElement
    private String SetBnkCode;

    @XmlElement
    private String PayerInfo;

    @XmlElement
    private String IdType;

    @XmlElement
    private String Id;

    @XmlElement
    private String Nation;

    @XmlElement
    private String Name;

    @XmlElement
    private String Phone;

    @XmlElement
    private String Address;

    @XmlElement
    private String Email;

    @XmlElement
    private String JOEBPPSNo;

    public String getTransactions() {
        return transactions;
    }

    public void setTransactions(String transactions) {
        this.transactions = transactions;
    }

    public String getTrxInf() {
        return trxInf;
    }

    public void setTrxInf(String trxInf) {
        this.trxInf = trxInf;
    }

    public String getAcctInfo() {
        return acctInfo;
    }

    public void setAcctInfo(String acctInfo) {
        this.acctInfo = acctInfo;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getBillingNo() {
        return billingNo;
    }

    public void setBillingNo(String billingNo) {
        this.billingNo = billingNo;
    }

    public String getBillerCode() {
        return billerCode;
    }

    public void setBillerCode(String billerCode) {
        this.billerCode = billerCode;
    }

    public String getJOEBPPSTrx() {
        return JOEBPPSTrx;
    }

    public void setJOEBPPSTrx(String JOEBPPSTrx) {
        this.JOEBPPSTrx = JOEBPPSTrx;
    }

    public String getBankTrxID() {
        return BankTrxID;
    }

    public void setBankTrxID(String bankTrxID) {
        BankTrxID = bankTrxID;
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    public String getPmtSrc() {
        return PmtSrc;
    }

    public void setPmtSrc(String pmtSrc) {
        PmtSrc = pmtSrc;
    }

    public String getBankCode() {
        return BankCode;
    }

    public void setBankCode(String bankCode) {
        BankCode = bankCode;
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

    public String getFeesAmt() {
        return FeesAmt;
    }

    public void setFeesAmt(String feesAmt) {
        FeesAmt = feesAmt;
    }

    public String getFeesOnBiller() {
        return FeesOnBiller;
    }

    public void setFeesOnBiller(String feesOnBiller) {
        FeesOnBiller = feesOnBiller;
    }

    public String getProcessDate() {
        return ProcessDate;
    }

    public void setProcessDate(String processDate) {
        ProcessDate = processDate;
    }

    public String getSTMTDate() {
        return STMTDate;
    }

    public void setSTMTDate(String STMTDate) {
        this.STMTDate = STMTDate;
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

    public String getServiceType() {
        return ServiceType;
    }

    public void setServiceType(String serviceType) {
        ServiceType = serviceType;
    }

    public String getSubPmts() {
        return SubPmts;
    }

    public void setSubPmts(String subPmts) {
        SubPmts = subPmts;
    }

    public String getSubPmt() {
        return subPmt;
    }

    public void setSubPmt(String subPmt) {
        this.subPmt = subPmt;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getSetBnkCode() {
        return SetBnkCode;
    }

    public void setSetBnkCode(String setBnkCode) {
        SetBnkCode = setBnkCode;
    }

    public String getPayerInfo() {
        return PayerInfo;
    }

    public void setPayerInfo(String payerInfo) {
        PayerInfo = payerInfo;
    }

    public String getIdType() {
        return IdType;
    }

    public void setIdType(String idType) {
        IdType = idType;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getNation() {
        return Nation;
    }

    public void setNation(String nation) {
        Nation = nation;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getJOEBPPSNo() {
        return JOEBPPSNo;
    }

    public void setJOEBPPSNo(String JOEBPPSNo) {
        this.JOEBPPSNo = JOEBPPSNo;
    }
}
