package com.experts.core.biller.statemachine.api.order;

public enum OrderState {
    OpenTicket,
    RECEIVEREQUEST,
    Waiting,
    EventProcessing,
    Completed,
    Canceled
}