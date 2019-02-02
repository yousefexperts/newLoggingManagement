package com.experts.core.biller.statemachine.api.model.domain.jpa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name  = "roles_auth")
public class Roles  extends AbstractEntity_ {

    @Column(name  = "auth" , nullable = false , unique = true)
    private String authName;

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }
}
