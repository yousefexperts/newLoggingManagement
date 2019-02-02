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
@Table(name  = "bank_service_catogery_type")
@SpaceClass
public class BankServiceCatogeryType extends AbstractEntity_ implements Serializable {

    @Column(name  = "type" , nullable = false)
    private String type;

    @SpaceIndex
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private int version;


    @SpaceVersion
    public int getVersion() {
        return version;
    }

}
