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
import java.util.Date;

@Entity
@Table(name  = "system_log")
@SpaceClass
public class SystemExceptionLog extends AbstractEntity_ implements Serializable {

    @Column(name  = "name" , nullable = false)
    private String name;

    @Column(name  = "happend_date" , nullable = false)
    private Date happendDate;

    @Column(name  = "message" , nullable = false)
    private String message;

    @Column(name  = "exception" , nullable = false)
    private String exception;


    @SpaceIndex
    @SpacePersist
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @SpaceIndex
    @SpacePersist
    public Date getHappendDate() {
        return happendDate;
    }


    public void setHappendDate(Date happendDate) {
        this.happendDate = happendDate;
    }

    @SpaceIndex
    @SpacePersist
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @SpaceIndex
    @SpacePersist
    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }


    private int version;


    @SpaceVersion
    public int getVersion() {
        return version;
    }

}
