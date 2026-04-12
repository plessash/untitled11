package org.example.ex3.strategy.service;

import org.example.ex3.strategy.PaymentStrategy;

import java.math.BigDecimal;

public class PaymentContext {

    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(BigDecimal amount) {
        paymentStrategy.pay(amount);
    }
}
