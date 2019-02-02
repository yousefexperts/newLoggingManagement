package com.experts.core.biller.statemachine.api.service.impl;


import com.experts.core.biller.statemachine.api.soapService.PrePaidServiceRequest;
import com.experts.core.biller.statemachine.api.soapService.PrePaidServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.server.endpoint.annotation.*;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;

@RestController
@Configuration
@Endpoint
@WebService
@HandlerChain(file="handler-chain.xml")
/*@Import(PrePaidServiceCreationStructure.class)*/
public class PaymentPrePaidController {

    /*@Autowired
    private PrePaidServiceCreationStructure prePaidServiceCreationStructure;*/

    @WebMethod(operationName = "prepaid" , action = "save")
    @PayloadRoot(namespace = "http://localhost:3070/prepaid", localPart = "PrePaidRequest")
    @RequestMapping(value = "/prepaid" , method = RequestMethod.POST , produces = {"application/xml"})
    public @ResponsePayload String prepaid(@RequestPayload PrePaidServiceRequest request ) throws NoSuchAlgorithmException,CertificateException, UnsupportedEncodingException,KeyStoreException,  NoSuchAlgorithmException , NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnrecoverableKeyException, InvalidKeySpecException, IOException, InvalidKeyException, SignatureException , Exception {

        PrePaidServiceResponse response = new PrePaidServiceResponse();

        response.setAcctInfo("1-0056987GH");
        response.setBankTrxID("1-0056987GH");
        response.setBillerCode("100-5487GH");
        response.setCurrency("JD");
        response.setDueAmt("3568");
        response.setErrorCode("Passed");
        response.setErrorDesc("Passed");
        response.setJOEBPPSTrx("Sr.Techncial-Lead");
        response.setPmtStatus("Passed");
        response.setValidationCode("15487GHF");

        /*PrePaidPaymentDTO dto = new PrePaidPaymentDTO();
        dto.setArr(Arrays.asList(response));

        String xml = prePaidServiceCreationStructure.init(dto);*/

        return "Starter";
    }

}
