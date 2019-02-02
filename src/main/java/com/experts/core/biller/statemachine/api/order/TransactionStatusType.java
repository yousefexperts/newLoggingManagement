package com.experts.core.biller.statemachine.api.order;

public enum TransactionStatusType {
    CREATED, PAYMENT_ON_ANALYZIS, WAITING_PAY, PAID, CANCELLED, MANUAL_ANALYSIS
}