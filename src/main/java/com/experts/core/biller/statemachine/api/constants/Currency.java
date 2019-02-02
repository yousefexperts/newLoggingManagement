package com.experts.core.biller.statemachine.api.constants;

public enum Currency {

    NIS("NIS"), USD("USD") , UERO("UERO"),JD("JD");

    private String currency;

    Currency(String currency){
        this.currency = currency;
    }
}
