package com.experts.core.biller.statemachine.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

import java.io.IOException;


public class BillPullWsdlConf {



    public DefaultWsdl11Definition defaultWsdlBillPullDefinition(XsdSchema pulls) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("BillPullRequest");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://www.experts.ps/ws");
        wsdl11Definition.setSchema(pulls);
        return wsdl11Definition;
    }




}
