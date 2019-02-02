package com.experts.core.biller.statemachine.api.model.domain.jpa;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceIndex;
import com.gigaspaces.annotation.pojo.SpacePersist;
import com.gigaspaces.annotation.pojo.SpaceVersion;
import lombok.Data;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


@Data
@Entity
@XmlRootElement(name  = "billing_creation")
@XmlAccessorType
@SpaceClass
public class BillingCreation extends AbstractEntity_ implements Serializable {

    @XmlElement(name  = "billCode" , required = true , nillable = false)
    private String billCode;

    @XmlElement(name  = "billName" , required = true , nillable = false)
    private String billName;

    @XmlElement(name  = "billerName" , required = true , nillable = false)
    private String billerName;

    @XmlElement(name  = "billerCode" , required = true , nillable = false)
    private String billerCode;

    @XmlElement(name  = "billerAddress" , required = true , nillable = false)
    private String billerAddress;

    @XmlElement(name  = "clientId" , required = true , nillable = false)
    private String clientId;

    @XmlElement(name  = "onServiceBy" , required = false , nillable = true)
    private String onServiceBy;

    @XmlElement(name  = "bankId" , required = true , nillable = false)
    private String bankId;

    @XmlElement(name  = "bankName" , required = true , nillable = false)
    private String bankName;

    @XmlElement(name  = "bankAddress" , required = true , nillable = false)
    private String bankAddress;

    @XmlElement(name  = "bankCode" , required = true , nillable = false)
    private String bankCode;


    @SpaceIndex
	@SpacePersist
	public String getBillCode() {
		return billCode;
	}

	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}

	@SpaceIndex
	@SpacePersist
	public String getBillName() {
		return billName;
	}

	public void setBillName(String billName) {
		this.billName = billName;
	}

	@SpaceIndex
	@SpacePersist
	public String getBillerName() {
		return billerName;
	}

	public void setBillerName(String billerName) {
		this.billerName = billerName;
	}

	@SpaceIndex
	@SpacePersist
	public String getBillerCode() {
		return billerCode;
	}

	public void setBillerCode(String billerCode) {
		this.billerCode = billerCode;
	}

	@SpaceIndex
	@SpacePersist
	public String getBillerAddress() {
		return billerAddress;
	}

	public void setBillerAddress(String billerAddress) {
		this.billerAddress = billerAddress;
	}

	@SpaceIndex
	@SpacePersist
	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	@SpaceIndex
	@SpacePersist
	public String getOnServiceBy() {
		return onServiceBy;
	}

	public void setOnServiceBy(String onServiceBy) {
		this.onServiceBy = onServiceBy;
	}

	@SpaceIndex
	@SpacePersist
	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	@SpaceIndex
	@SpacePersist
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@SpaceIndex
	@SpacePersist
	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	@SpaceIndex
	@SpacePersist
	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
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
