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
@Table(name  = "account_type")
@SpaceClass
public class AccountType extends AbstractEntity_ implements Serializable {

    @Column(name  = "account_type" , nullable = false)
    private String accountType;


    @SpaceIndex
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    private int version;


    @SpaceVersion
    public int getVersion() {
        return version;
    }
}
