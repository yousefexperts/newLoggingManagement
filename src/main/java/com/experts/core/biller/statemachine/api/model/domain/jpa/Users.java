package com.experts.core.biller.statemachine.api.model.domain.jpa;


import com.experts.core.biller.statemachine.api.model.EntityRevisionListener_;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceVersion;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

@Entity
@Table(name =  "users_")
@Data
@EntityListeners({EntityRevisionListener_.class})
@SpaceClass
public class Users extends AbstractEntity_ {

    private int version;

    @SpaceVersion
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Column(name  = "username_token" , nullable = false)
    private String usernameToken;

    @Column(name  = "password_token" , nullable = false)
    private String passwordToken;

    @Column(name  = "enabled" , nullable = false)
    private boolean isEnabled;

    @Column(name  = "blocked" , nullable = true)
    private boolean isBlocked;

    @JsonCreator( mode  = JsonCreator.Mode.PROPERTIES)
    public Users(){}

    public String getUsernameToken() {
        return usernameToken;
    }

    public void setUsernameToken(String usernameToken) {
        this.usernameToken = usernameToken;
    }

    public String getPasswordToken() {
        return passwordToken;
    }

    public void setPasswordToken(String passwordToken) {
        this.passwordToken = passwordToken;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }
}
