package com.experts.core.biller.statemachine.api;


import com.experts.core.biller.statemachine.api.soapService.InquiryDetailsRequest;
import com.experts.core.biller.statemachine.api.soapService.InquiryDetailsResponse;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunClient {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SoapClientConfig.class);
        BeerClient wsclient = context.getBean(BeerClient.class);
        InquiryDetailsRequest request = new InquiryDetailsRequest();
        request.setUserId("2");
        InquiryDetailsResponse resp = wsclient.getBeer(request);
        System.out.println("response: " + resp);
    }

}