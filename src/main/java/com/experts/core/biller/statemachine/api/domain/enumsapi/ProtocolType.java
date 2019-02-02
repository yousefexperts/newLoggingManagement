package com.experts.core.biller.statemachine.api.domain.enumsapi;

public enum ProtocolType {
    http("HTTP") , https("Https") ;
    private String type;

    ProtocolType(String type){
        this.type= type;
    }
}
