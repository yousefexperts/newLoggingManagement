package com.experts.core.biller.statemachine.api.model.domain.jpa.settlement;

import com.experts.core.biller.statemachine.api.model.domain.jpa.AbstractEntity_;
import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceIndex;
import com.gigaspaces.annotation.pojo.SpaceVersion;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name  = "bank_details")
@SpaceClass
public class Bank extends AbstractEntity_ implements Serializable {

    @Column(name  = "bank_name" , nullable = false)
    private String bankName;

    @Column(name  = "bank_code" , nullable = false)
    private String bankCode;

    @Column(name  = "bank_email" , nullable = true)
    private String bankEmail;

    @Column(name  = "bank_phone" , nullable = true)
    private String bankPhone;

    @Column(name  = "bank_address" , nullable = false)
    private String bankAddress;

    @Column(name = "bank_address_street" , nullable = false)
    private String bankAddressStreet;

    @SpaceIndex
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @SpaceIndex
    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    @SpaceIndex
    public String getBankEmail() {
        return bankEmail;
    }

    public void setBankEmail(String bankEmail) {
        this.bankEmail = bankEmail;
    }

    @SpaceIndex
    public String getBankPhone() {
        return bankPhone;
    }

    public void setBankPhone(String bankPhone) {
        this.bankPhone = bankPhone;
    }

    @SpaceIndex
    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    @SpaceIndex
    public String getBankAddressStreet() {
        return bankAddressStreet;
    }

    public void setBankAddressStreet(String bankAddressStreet) {
        this.bankAddressStreet = bankAddressStreet;
    }

    private int version;


    @SpaceVersion
    public int getVersion() {
        return version;
    }
}
