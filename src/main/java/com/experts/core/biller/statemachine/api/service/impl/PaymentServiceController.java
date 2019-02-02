package com.experts.core.biller.statemachine.api.service.impl;


import com.experts.core.biller.statemachine.api.soapService.PaymentNotificationRequest;
import com.experts.core.biller.statemachine.api.soapService.PaymentNotificationResponse;
import com.experts.core.biller.statemachine.api.soapService.PaymentOrderRequest;
import com.experts.core.biller.statemachine.api.soapService.PaymentOrderResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.Produces;
import java.util.Arrays;
import java.util.List;

@RestController
@Configuration
@WebService
@Endpoint
public class PaymentServiceController {



    @WebMethod(action = "payment" , operationName = "save")
    @PayloadRoot( namespace = "http://localhost:3070/payment", localPart = "PaymentRequest")
    @RequestMapping(value = "/payment" , method = RequestMethod.POST , produces = {"application/xml"} )
    public  @ResponsePayload PaymentOrderResponse payment(@RequestPayload PaymentOrderRequest request ){

        PaymentOrderResponse response = new PaymentOrderResponse();

        response.setAcctInfo("15487-GHD");
        response.setBillerCode("1-2154TD");
        response.setBillingNo("1054-NT");
        response.setBillNo("1458-TCI");
        response.setCustIDNo("100-TL");
        response.setErrorCode("Passed");
        response.setDueAmt("15487");
        response.setExtraInfo("Empty");
        response.setIdType("4587-HT");
        response.setPaidAmt("15400");
        response.setTransactions("10054-TR");
        response.setPmtType("Electronic");
        response.setResult("Passed");
        response.setValidationCode("0548TE");

        return response;

    }

}
