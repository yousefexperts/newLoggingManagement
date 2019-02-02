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
@Table(name  = "bank_service_catogery")
@SpaceClass
public class BankServiceCatogery extends AbstractEntity_ implements Serializable {

    @Column(name  = "service_name" , nullable = false)
   private String name;

    @Column(name  = "type" , nullable = false)
   private BankServiceCatogeryType  type;

    @Column(name  = "deleted" , nullable = true)
   private boolean isDeleted;

    @SpaceIndex
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @SpaceIndex
    public BankServiceCatogeryType getType() {
        return type;
    }

    public void setType(BankServiceCatogeryType type) {
        this.type = type;
    }

    @SpaceIndex
    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    private int version;


    @SpaceVersion
    public int getVersion() {
        return version;
    }
}
