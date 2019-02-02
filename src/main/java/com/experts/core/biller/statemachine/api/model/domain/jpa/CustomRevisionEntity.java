package com.experts.core.biller.statemachine.api.model.domain.jpa;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by mtumilowicz on 2018-07-15.
 */
@Entity
@Table(name = "CustomRevisionEntity")
@Data
public class CustomRevisionEntity extends AbstractEntity_ {
    private String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


    @ManyToOne(fetch = FetchType.LAZY , cascade =  CascadeType.ALL )
    private CustomTrackingEntity customTrackingEntity;
}