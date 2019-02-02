package com.experts.core.biller.statemachine.api.constants;

public enum TasksType {

    WAITING("NIS"), PROCESSOR("USD") , INITIAL("UERO"),PAY("JD");

    private String type;

    TasksType(String type){
        this.type = type;
    }

}
