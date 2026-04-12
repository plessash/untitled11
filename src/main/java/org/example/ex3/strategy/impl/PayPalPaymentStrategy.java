package org.example.ex3.strategy.impl;

import org.example.ex3.strategy.PaymentStrategy;

import java.math.BigDecimal;

public class PayPalPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Оплата через PayPal на сумму:" + amount);
    }
}
