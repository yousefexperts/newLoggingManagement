package com.experts.core.biller.statemachine.api.model.domain.jpa;


import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceIndex;
import com.gigaspaces.annotation.pojo.SpacePersist;
import com.gigaspaces.annotation.pojo.SpaceVersion;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name  = "bill_pull_request")
@XmlRootElement(name  = "bill_pull_request_creation")
@XmlAccessorType
@Data
@SpaceClass
public class BillPullTransactionResponse extends AbstractEntity_ implements Serializable {


    @XmlElement(name  = "res_count" , required = true)
    @Column(name  = "res_count" , nullable = false)
    private String resCount;


    @XmlElement(name  = "bills_rec" , required = true)
    @Column(name  = "bills_rec" , nullable = false)
    private String billsRec;

    @XmlElement(name  = "bill_rec" , required = true)
    @Column(name  = "bill_rec" , nullable = false)
    private String billRec;


    @Column(name  = "result" , nullable = false)
    @XmlElement(name = "result" , required = true)
    private String result;

    @Column(name  = "error_code" , nullable = false)
    @XmlElement(name  = "error_code" , required = true)
    private String errorCode;


    @XmlElement(name  = "error_desc" , required = true)
    @Column(name  = "error_desc" , nullable = false)
    private String errorDesc;


    @XmlElement(name  = "erverity" , required = true)
    @Column(name  = "erverity" , nullable = false)
    private String serverity;


    @Column(name  = "acc_info" , nullable = false)
    @XmlElement(name  = "acc_inf" , required = true)
    private String accInfo;


    @Column(name  = "bill_no" , nullable = false)
    @XmlElement(name  = "bill_no" , required = true)
    private String billNo;


    @Column(name  = "billing_no" , nullable = false)
    @XmlElement(name  = "billing_no" , required = true)
    private String billingNo;


    @Column(name  = "bill_status" , nullable = false)
    @XmlElement(name  = "bill_status" , required = true)
    private String billStatus;

    @Column(name = "due_anount" , nullable = false)
    @XmlElement(name  = "due_amount" , required = true)
    private String dueAmount;


    @Column(name  = "currency" , nullable = false)
    @XmlElement(name = "currency" , required = true)
    private String currency;

    @XmlElement(name  = "issue_date" , required = true)
    @Column(name  = "issue_date" , nullable = false)
    private String issueDate;


    @Column(name  = "open_date" , nullable = true)
    @XmlElement(name  = "open_date" , required = false)
    private Date openDate;


    @Column(name  = "due_date" , nullable = false)
    @XmlElement(name  = "due_date" , required = true)
    private Date dueDate;

    @Column(name  = "expiry_date" , nullable = true)
    @XmlElement(name  = "expiry_date" , required = false)
    private Date expiryDate;

    @Column(name  = "close_date" , nullable = true)
    @XmlElement(name  = "close_date" , required = false)
    private Date closeDate;


   @Column(name  = "service_type" , nullable = false)
   @XmlElement(name  = "service_type" , required = true)
    private String serviceType;

    @Column(name  = "bill_type" , nullable = true)
    @XmlElement(name  = "bill_type" , required = false)
    private String billType;


    @Column(name  = "pmt_const" , nullable = true)
    @XmlElement(name  = "pmt_const" , required = false)
    private String pmtConst;

    @Column(name= "allow_part" , nullable = false)
    @XmlElement(name  = "allow_part" , required = true)
    private String allowPart;

    @Column(name  = "lower" , nullable = false)
    @XmlElement(name  = "lower" , required = true)
    private String lower;

    @Column(name  = "upper" , nullable = false)
    @XmlElement(name  = "upper" , required = true)
    private String upper;


    @Column(name  = "sub_pmts" , nullable = false)
    @XmlElement(name  = "sub_pmts" , required = true)
    private String subPmts;

    @Column(name  = "sub_pmt" , nullable = false)
    @XmlElement(name  = "sub_pmt" , required = true)
    private String subPmt;

    @Column(name  = "amount" , nullable = false)
    @XmlElement(name  = "amount" , required = true)
    private String amount;


    @Column(name  = "bank_code" , nullable = false)
    @XmlElement(name  = "bank_code" , required = true)
    private String bankCode;


    @Column(name  = "acc_no" , nullable = false)
    @XmlElement(name  = "acc_no" , required = true)
    private String accNo;


    @SpaceIndex
	@SpacePersist
	public String getResCount() {
		return resCount;
	}


	public void setResCount(String resCount) {
		this.resCount = resCount;
	}


	@SpaceIndex
	@SpacePersist
	public String getBillsRec() {
		return billsRec;
	}


	public void setBillsRec(String billsRec) {
		this.billsRec = billsRec;
	}


	@SpaceIndex
	@SpacePersist
	public String getBillRec() {
		return billRec;
	}


	public void setBillRec(String billRec) {
		this.billRec = billRec;
	}


	@SpaceIndex
	@SpacePersist
	public String getResult() {
		return result;
	}


	public void setResult(String result) {
		this.result = result;
	}


	@SpaceIndex
	@SpacePersist
	public String getErrorCode() {
		return errorCode;
	}


	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}


	@SpaceIndex
	@SpacePersist
	public String getErrorDesc() {
		return errorDesc;
	}


	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}


	@SpaceIndex
	@SpacePersist
	public String getServerity() {
		return serverity;
	}


	public void setServerity(String serverity) {
		this.serverity = serverity;
	}

	@SpaceIndex
	@SpacePersist

	public String getAccInfo() {
		return accInfo;
	}


	public void setAccInfo(String accInfo) {
		this.accInfo = accInfo;
	}


	@SpaceIndex
	@SpacePersist
	public String getBillNo() {
		return billNo;
	}


	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}


	@SpaceIndex
	@SpacePersist
	public String getBillingNo() {
		return billingNo;
	}


	public void setBillingNo(String billingNo) {
		this.billingNo = billingNo;
	}


	@SpaceIndex
	@SpacePersist
	public String getBillStatus() {
		return billStatus;
	}


	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}


	@SpaceIndex
	@SpacePersist
	public String getDueAmount() {
		return dueAmount;
	}


	public void setDueAmount(String dueAmount) {
		this.dueAmount = dueAmount;
	}


	@SpaceIndex
	@SpacePersist
	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@SpaceIndex
	@SpacePersist
	public String getIssueDate() {
		return issueDate;
	}


	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}


	@SpaceIndex
	@SpacePersist
	public Date getOpenDate() {
		return openDate;
	}


	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	@SpaceIndex
	@SpacePersist
	public Date getDueDate() {
		return dueDate;
	}


	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}


	@SpaceIndex
	@SpacePersist
	public Date getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}


	@SpaceIndex
	@SpacePersist
	public Date getCloseDate() {
		return closeDate;
	}


	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}


	@SpaceIndex
	@SpacePersist
	public String getServiceType() {
		return serviceType;
	}


	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}


	@SpaceIndex
	@SpacePersist
	public String getBillType() {
		return billType;
	}


	public void setBillType(String billType) {
		this.billType = billType;
	}


	@SpaceIndex
	@SpacePersist
	public String getPmtConst() {
		return pmtConst;
	}


	public void setPmtConst(String pmtConst) {
		this.pmtConst = pmtConst;
	}


	@SpaceIndex
	@SpacePersist
	public String getAllowPart() {
		return allowPart;
	}


	public void setAllowPart(String allowPart) {
		this.allowPart = allowPart;
	}


	@SpaceIndex
	@SpacePersist
	public String getLower() {
		return lower;
	}


	public void setLower(String lower) {
		this.lower = lower;
	}

	@SpaceIndex
	@SpacePersist
	public String getUpper() {
		return upper;
	}


	public void setUpper(String upper) {
		this.upper = upper;
	}


	@SpaceIndex
	@SpacePersist
	public String getSubPmts() {
		return subPmts;
	}


	public void setSubPmts(String subPmts) {
		this.subPmts = subPmts;
	}


	@SpaceIndex
	@SpacePersist
	public String getSubPmt() {
		return subPmt;
	}


	public void setSubPmt(String subPmt) {
		this.subPmt = subPmt;
	}


	@SpaceIndex
	@SpacePersist
	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}

	@SpaceIndex
	@SpacePersist
	public String getBankCode() {
		return bankCode;
	}


	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	@SpaceIndex
	@SpacePersist
	public String getAccNo() {
		return accNo;
	}


	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

    
    private int version;


    @SpaceVersion
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}
