package com.experts.core.biller.statemachine.api.model.domain.jpa.settlement;

import com.experts.core.biller.statemachine.api.model.domain.jpa.AbstractEntity_;
import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceIndex;
import com.gigaspaces.annotation.pojo.SpaceVersion;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name  = "bank_services")
@SpaceClass
public class BankServices extends AbstractEntity_ implements Serializable {

    @Column(name  = "name" , nullable = false)
    private String service;

    @Column(name  = "catogrey" , nullable = false)
    private BankServiceCatogeryType catogeryType;

    @Column(name  = "cost" , nullable = false)
    private int cost;

    @Temporal( TemporalType.TIMESTAMP)
    @Column(name  = "start_date" , nullable = false)
    private Date startDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name  = "end_date" , nullable = true)
    private Date endDate;

    @Column(name  = "arabic_name" , nullable = false)
    private String arabicName;

    @Column(name  = "english_name" , nullable = false)
    private String englishName;

    @Column(name  = "arabic_short_name" , nullable = true)
    private String arabicShortName;

    @Column(name =  "english_short_name" , nullable = true)
    private String englishShortName;


    @SpaceIndex
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @SpaceIndex
    public BankServiceCatogeryType getCatogeryType() {
        return catogeryType;
    }

    public void setCatogeryType(BankServiceCatogeryType catogeryType) {
        this.catogeryType = catogeryType;
    }

    @SpaceIndex
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @SpaceIndex
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @SpaceIndex
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @SpaceIndex
    public String getArabicName() {
        return arabicName;
    }

    public void setArabicName(String arabicName) {
        this.arabicName = arabicName;
    }

    @SpaceIndex
    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    @SpaceIndex
    public String getArabicShortName() {
        return arabicShortName;
    }

    public void setArabicShortName(String arabicShortName) {
        this.arabicShortName = arabicShortName;
    }

    @SpaceIndex
    public String getEnglishShortName() {
        return englishShortName;
    }

    public void setEnglishShortName(String englishShortName) {
        this.englishShortName = englishShortName;
    }

    private int version;


    @SpaceVersion
    public int getVersion() {
        return version;
    }
}
