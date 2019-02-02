package com.experts.core.biller.statemachine.api;


import com.experts.core.biller.statemachine.api.soapService.InquiryDetailsRequest;
import com.experts.core.biller.statemachine.api.soapService.InquiryDetailsResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class BeerClient extends WebServiceGatewaySupport {

    public InquiryDetailsResponse getBeer(InquiryDetailsRequest request){
        return (InquiryDetailsResponse) getWebServiceTemplate()
                .marshalSendAndReceive(request);

    }
}