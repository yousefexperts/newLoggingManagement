package com.experts.core.biller.statemachine.api.model.domain.jpa.settlement;

import com.experts.core.biller.statemachine.api.domain.enumsapi.ProtocolType;
import com.experts.core.biller.statemachine.api.model.domain.jpa.AbstractEntity_;
import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceIndex;
import com.gigaspaces.annotation.pojo.SpacePersist;
import com.gigaspaces.annotation.pojo.SpaceVersion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Biller_Api_Integrations")
@SpaceClass
public class Billers extends AbstractEntity_ implements Serializable {

    @Column(name  = "biller_name" , nullable = false)

    private String billerName;

    @Column(name  = "billpull_url" , nullable = false)
    private String billPull;

    @Column(name  = "payment_notification_url" , nullable = false)
    private String paymentNotification;

    @Column(name  = "phone_1" , nullable = false)
    private String phone_1;

    @Column(name  = "phone_2" , nullable = true)
    private String phone_2;

    @Column(name  = "email" , nullable = false)
    private String email;

    @Column(name  = "pox" , nullable = true)
    private String pox;

    @Column(name  = "street_address" , nullable = false)
    private String streetAddress;

    @Column(name  = "building_no" , nullable = false)
    private String buildingNo;

    @Column(name  = "floorNo" , nullable =  true)
    private String floorNo;

    @Column(name  = "protocol" , nullable = false)
    private ProtocolType type;

    @Column(name  = "pk_content" , nullable = false)
    private String pkContent;

    @Column(name  = "pub_content" , nullable = false)
    private String pubContent;

    @Column(name  = "cert_content" , nullable = false)
    private String certContent;

    @Column(name  = "folder_name" , nullable = false)
    private String folderName;

    @Column(name  = "file_name" , nullable = false)
    private String fileName;

    @Column(name  = "serial_number" , nullable = false)
    private String serialNumber;

    @Column(name  = "alias_name" , nullable = false)
    private String aliasName;


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
    public String getBillPull() {
        return billPull;
    }

    public void setBillPull(String billPull) {
        this.billPull = billPull;
    }

    @SpaceIndex
    @SpacePersist
    public String getPaymentNotification() {
        return paymentNotification;
    }

    public void setPaymentNotification(String paymentNotification) {
        this.paymentNotification = paymentNotification;
    }

    @SpaceIndex
    @SpacePersist
    public String getPhone_1() {
        return phone_1;
    }

    public void setPhone_1(String phone_1) {
        this.phone_1 = phone_1;
    }

    @SpaceIndex
    @SpacePersist
    public String getPhone_2() {
        return phone_2;
    }

    public void setPhone_2(String phone_2) {
        this.phone_2 = phone_2;
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
    public String getPox() {
        return pox;
    }

    public void setPox(String pox) {
        this.pox = pox;
    }

    @SpaceIndex
    @SpacePersist
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }


    @SpaceIndex
    @SpacePersist
    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    @SpaceIndex
    @SpacePersist
    public String getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo;
    }

    @SpaceIndex
    @SpacePersist
    public ProtocolType getType() {
        return type;
    }

    public void setType(ProtocolType type) {
        this.type = type;
    }

    @SpaceIndex
    @SpacePersist
    public String getPkContent() {
        return pkContent;
    }

    public void setPkContent(String pkContent) {
        this.pkContent = pkContent;
    }

    @SpaceIndex
    @SpacePersist
    public String getPubContent() {
        return pubContent;
    }

    public void setPubContent(String pubContent) {
        this.pubContent = pubContent;
    }

    @SpaceIndex
    @SpacePersist
    public String getCertContent() {
        return certContent;
    }

    public void setCertContent(String certContent) {
        this.certContent = certContent;
    }

    @SpaceIndex
    @SpacePersist
    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    @SpaceIndex
    @SpacePersist
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @SpaceIndex
    @SpacePersist
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @SpaceIndex
    @SpacePersist
    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    private int version;


    @SpaceVersion
    public int getVersion() {
        return version;
    }
}
