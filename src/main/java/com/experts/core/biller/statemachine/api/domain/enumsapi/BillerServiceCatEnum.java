package com.experts.core.biller.statemachine.api.domain.enumsapi;

public enum BillerServiceCatEnum {
    BillPull("BillPull"),PaymentNotification("PaymentNotification"),Payment("Payment");

    private String service;

    BillerServiceCatEnum(String service){

        this.service =  service;
    }




}
