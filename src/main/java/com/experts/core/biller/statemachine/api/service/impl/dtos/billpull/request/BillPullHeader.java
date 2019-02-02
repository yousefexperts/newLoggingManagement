package com.experts.core.biller.statemachine.api.service.impl.dtos.billpull.request;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "MsgHeader")
@XmlAccessorType(XmlAccessType.FIELD)
public class BillPullHeader {

    @XmlElement(name  = "TmStp" , required = true)
    private Date tmStp;

    @XmlElement(name = "TrsInf" , required = true)
    private TrsInf trsInf;

    public Date getTmStp() {
        return tmStp;
    }

    public void setTmStp(Date tmStp) {
        this.tmStp = tmStp;
    }

    public TrsInf getTrsInf() {
        return trsInf;
    }

    public void setTrsInf(TrsInf trsInf) {
        this.trsInf = trsInf;
    }
}
