package com.experts.core.biller.statemachine.api.model.domain.jpa.settlement;

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
@Table(name  = "employee_details")
@SpaceClass
public class EmployeeDetails extends AbstractEntity_ implements Serializable {

    @Column(name  = "full_name" , nullable = false)
    private String fullName;

    @Column(name  = "first_name" , nullable = false)
    private String fName;

    @Column(name  = "second_name" , nullable = true)
    private String secondName;

    @Column(name  = "third_name" , nullable = false)
    private String thirdName;

    /*@Column(name = "username" , nullable = false)
    private String userName;

    @Column(name  = "password" , nullable = false)
    private String password;*/

    @Column(name  = "blocked" , nullable = true)
    private boolean isBlock =  false;

    @Column(name  = "deleted" , nullable = true)
    private boolean isDeleted = false;

    @Column(name = "password_expired" , nullable = true)
    private boolean isPasswordExpired;

    @SpaceIndex
    @SpacePersist
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @SpaceIndex
    @SpacePersist
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    @SpaceIndex
    @SpacePersist
    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @SpaceIndex
    @SpacePersist
    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

  /*  @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }*/

    @SpaceIndex
    @SpacePersist
    public boolean isBlock() {
        return isBlock;
    }

    public void setBlock(boolean block) {
        isBlock = block;
    }

    @SpaceIndex
    @SpacePersist
    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @SpaceIndex
    @SpacePersist
    public boolean isPasswordExpired() {
        return isPasswordExpired;
    }

    public void setPasswordExpired(boolean passwordExpired) {
        isPasswordExpired = passwordExpired;
    }

    private int version;


    @SpaceVersion
    public int getVersion() {
        return version;
    }

}
