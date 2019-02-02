package com.experts.core.biller.statemachine.api.constants;

public enum OperationsPersist {

    INSERT("INSERT"), UPDATE("UPDATE") , DELETE("DELETE"),CREATE("CREATE");

    private String ops;

    OperationsPersist(String ops){
        this.ops = ops;
    }

}
