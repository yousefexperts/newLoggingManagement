package com.experts.core.biller.statemachine.api.service.impl;



import com.experts.core.biller.statemachine.api.response.InquiryResponseCreation;
import com.experts.core.biller.statemachine.api.soapService.InquiryDetailsRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.List;

/*@RestController
@Configuration*/
public class IInquiryServiceController {

    public static final String NAMESPACE_URI = "http://localhost:3070/ws/inguiry";


    /*@Scope(scopeName = "singleton")
    public DataSource databaseGlobal() {
        return DataSourceBuilder.create().driverClassName("com.mysql.jdbc.Driver").url("jdbc:mysql://localhost:3306/biller?useSSL=true&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC").username("root").password("opc@2018").build();
    }
*/
    public IInquiryServiceController() {
    }




    /*@RequestMapping(name  = "/inquiry" , method = RequestMethod.POST)
    @ResponsePayload
    public String inquiry(@RequestPayload InquiryDetailsRequest request) throws Exception {
        *//*QueryDslJdbcTemplate qdslTemplate = new QueryDslJdbcTemplate(databaseGlobal());
        QManVoucherMaster MASTER = new QManVoucherMaster("c");
        SQLQuery netAmtQuery = qdslTemplate.newSqlQuery().from(MASTER).where(MASTER.compId.eq(String.valueOf(request.getUserId())));
        List<ManVouncherMaster> results = qdslTemplate.query(netAmtQuery, BeanPropertyRowMapper.newInstance(ManVouncherMaster.class), MASTER.netAmt , MASTER.agreementId , MASTER.agreementSerial , MASTER.allowAmt , MASTER.areaId , MASTER.baseAmt , MASTER.benSystemNo , MASTER.branchId , MASTER.calcDate ,MASTER.classCode ,MASTER.combinCodeCr ,MASTER.combinCodeDb , MASTER.compId ,MASTER.constantAmt , MASTER.consumptionAmt ,MASTER.consumptionType , MASTER.crateAmt ,MASTER.crateDate , MASTER.crateTypeCode ,MASTER.deductionAmt  ,MASTER.distributionDay ,MASTER.distributionRoute ,MASTER.dstrctCode , MASTER.compId ,MASTER.feeAmt , MASTER.remainAmt , MASTER.extraAmt , MASTER.customerType , MASTER.constantAmt , MASTER.creditQty , MASTER.ownerSystemNo ,MASTER.feesVoucherNo ,MASTER.feeAmt ,MASTER.meterFees);
        return dto(results);*//*

        String creation = InquiryResponseCreation.create();
        return creation;
    }*/


}
