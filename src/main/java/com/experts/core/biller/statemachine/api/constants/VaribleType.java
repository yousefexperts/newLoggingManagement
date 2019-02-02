package com.experts.core.biller.statemachine.api.constants;

public enum VaribleType
{

    Long("long"), Integer("int") , Double("double") , String("string") , Float("float") , BigDecmial("bigDecmial");

    private String type;

    VaribleType(String type){
        this.type = type;
    }

}
