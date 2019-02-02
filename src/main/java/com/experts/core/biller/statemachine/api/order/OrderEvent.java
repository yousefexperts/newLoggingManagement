package com.experts.core.biller.statemachine.api.order;

public enum OrderEvent {
    UnlockDelivery,
    ReceivePayment,
    Refund,
    Deliver,
    Reopen,
    Cancel
}