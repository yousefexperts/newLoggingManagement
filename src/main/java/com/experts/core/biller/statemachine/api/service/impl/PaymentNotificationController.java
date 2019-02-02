package com.experts.core.biller.statemachine.api.service.impl;



import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.server.endpoint.annotation.Endpoint;

import javax.jws.HandlerChain;
import javax.jws.WebService;

@RestController
@Configuration
@Endpoint
@WebService
@HandlerChain(file="handler-chain.xml")
public class PaymentNotificationController {



}
