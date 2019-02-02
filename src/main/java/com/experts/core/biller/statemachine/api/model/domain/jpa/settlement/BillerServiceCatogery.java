package com.experts.core.biller.statemachine.api.model.domain.jpa.settlement;

import com.experts.core.biller.statemachine.api.domain.enumsapi.BillerServiceCatEnum;
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
@Table(name  = "biller_service_catogrey")
@SpaceClass
public class BillerServiceCatogery extends AbstractEntity_ implements Serializable {

    @Column(name  = "service" , nullable = false)
    private String serviceName;

    @Column(name  = "type")
    private BillerServiceCatEnum type;


    @SpaceIndex
    @SpacePersist
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @SpaceIndex
    @SpacePersist
    public BillerServiceCatEnum getType() {
        return type;
    }

    public void setType(BillerServiceCatEnum type) {
        this.type = type;
    }


    private int version;


    @SpaceVersion
    public int getVersion() {
        return version;
    }

}
