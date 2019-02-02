package com.experts.core.biller.statemachine.api.domain.enumsapi;

public enum BillerServiceCatogreyEnum {
    BillPull("BillPull"),PaymentNotification("PaymentNotification"),Payment("Payment");

    private String service;

    BillerServiceCatogreyEnum(String service){

        this.service =  service;
    }




}
