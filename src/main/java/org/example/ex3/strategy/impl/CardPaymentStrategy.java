package org.example.ex3.strategy.impl;

import org.example.ex3.strategy.PaymentStrategy;

import java.math.BigDecimal;

public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Оплата картой на сумму: " + amount);
    }
}
