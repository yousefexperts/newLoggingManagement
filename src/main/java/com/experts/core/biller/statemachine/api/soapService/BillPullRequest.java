package com.experts.core.biller.statemachine.api.soapService;

import javax.xml.bind.annotation.*;

@XmlRootElement(namespace = "http:/192.168.10.230:3070/billpull", name = "BillPullRequest")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillPullServiceRequest", namespace = "http://192.168.10.230:3070//billpull", propOrder = {"Envelope"})

public class BillPullRequest {

    @XmlElement
    private String Envelope;

}
