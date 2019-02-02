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

@Entity
@Table(name  = "bill_pull_request")
@XmlRootElement(name  = "bill_pull_request_creation")
@XmlAccessorType
@Data
@SpaceClass
public class BillPullTransactionRequest extends AbstractEntity_ implements Serializable {


    @Column(name  = "acc_info" , nullable = false)
    @XmlElement(name = "acc_info" , required = true)
    private String acctInfo;

    @Column(name  = "billing_no" , nullable = false)
    @XmlElement(required = true , name = "billing_no" )
    private String billingNo;

    @Column(name  = "bill_no" , nullable = false)
    @XmlElement(name = "bill_no" , required = true)
    private String billNo;

    @Column(name  = "service_type" , nullable = true)
    @XmlElement(name  = "service_type" , required = false)
    private String serviceType;

    @Column(name  = "payer_info" , nullable = true)
    @XmlElement(name = "payer_info" , required = false)
    private String payerInfo;

    @Column(name  = "id_type" , nullable = true)
    @XmlElement(name  = "id_type" , required = false)
    private String idType;

    @Column(name  = "id" , nullable = true)
    @XmlElement(name  = "id" , required = true)
    private Long id;

    @Column(name  = "nation" , nullable = true)
    @XmlElement(name  = "nation" , required = false)
    private String nation;

    @Column(name  = "name" , nullable = true)
    @XmlElement(name = "name" , required = false)
    private String name;

    @Column(name  = "phone" , nullable = true)
    @XmlElement(name  = "phone" , required = false)
    private String phone;

    @Column(name  = "address" , nullable = true)
    @XmlElement(name =  "address" , required = false)
    private String address;

    @Column(name  = "email" , nullable = true)
    @XmlElement(name  = "email" , required = false)
    private String email;

    @Column(name  = "joebppsno" , nullable = false)
    @XmlElement(name  = "joebppsno" , required = false)
    private String joebppsno;


    @SpaceIndex
	@SpacePersist
	public String getAcctInfo() {
		return acctInfo;
	}

	public void setAcctInfo(String acctInfo) {
		this.acctInfo = acctInfo;
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
	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
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
	public String getPayerInfo() {
		return payerInfo;
	}

	public void setPayerInfo(String payerInfo) {
		this.payerInfo = payerInfo;
	}

	@SpaceIndex
	@SpacePersist
	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	@SpaceIndex
	@SpacePersist
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@SpaceIndex
	@SpacePersist
	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	@SpaceIndex
	@SpacePersist
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@SpaceIndex
	@SpacePersist
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@SpaceIndex
	@SpacePersist
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@SpaceIndex
	@SpacePersist
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@SpaceIndex
	@SpacePersist
	public String getJoebppsno() {
		return joebppsno;
	}

	public void setJoebppsno(String joebppsno) {
		this.joebppsno = joebppsno;
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
