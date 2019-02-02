package com.experts.core.biller.statemachine.api.soapService;

import javax.xml.bind.annotation.*;

@XmlRootElement(namespace = "http://localhost:3070/ws/billpull", name = "BillPullRequest")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillPullServiceRequest", namespace = "http://localhost:3070/ws/billpull", propOrder = {"acctInfo","billingNo","billNo","serviceType","payerInfo","idType","id","nation","name","phone","address","email","joebppsno"})

public class BillPullServiceRequest {

    @XmlElement
    private String acctInfo;

    @XmlElement
    private String billingNo;

    @XmlElement
    private String billNo;

    @XmlElement
    private String serviceType;

    @XmlElement
    private String payerInfo;

    @XmlElement
    private String idType;

    @XmlElement
    private String id;

    @XmlElement
    private String nation;

    @XmlElement
    private String name;

    @XmlElement
    private String phone;

    @XmlElement
    private String address;

    @XmlElement
    private String email;

    @XmlElement
    private String joebppsno;

    public String getAcctInfo() {
        return acctInfo;
    }

    public void setAcctInfo(String acctInfo) {
        this.acctInfo = acctInfo;
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

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getPayerInfo() {
        return payerInfo;
    }

    public void setPayerInfo(String payerInfo) {
        this.payerInfo = payerInfo;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJoebppsno() {
        return joebppsno;
    }

    public void setJoebppsno(String joebppsno) {
        this.joebppsno = joebppsno;
    }
}
