package com.experts.core.biller.statemachine.api.soapService;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://www.experts.ps/ws/billpull", name = "BillPullResult")
@XmlAccessorType(XmlAccessType.FIELD)
public class BillPullResponse {

    private String BillPullResult;

	public String getBillPullResult() {
		return BillPullResult;
	}

	public void setBillPullResult(String billPullResult) {
		BillPullResult = billPullResult;
	}

	
    
    
    
}
