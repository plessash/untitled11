package org.example.ex3.strategy.service;

import org.example.ex3.strategy.PaymentStrategy;
import org.example.ex3.strategy.impl.CardPaymentStrategy;
import org.example.ex3.strategy.impl.CashPaymentStrategy;
import org.example.ex3.strategy.impl.PayPalPaymentStrategy;

import java.util.HashMap;
import java.util.Map;

public class PaymentStrategyFactory {

    private final Map<String, PaymentStrategy> paymentStrategies = new HashMap<>();

    public PaymentStrategyFactory() {
        paymentStrategies.put("CARD", new CardPaymentStrategy());
        paymentStrategies.put("PAYPAL", new PayPalPaymentStrategy());
        paymentStrategies.put("CASH", new CashPaymentStrategy());
    }

    public PaymentStrategy getStrategy(String paymentType) {
        PaymentStrategy strategy = paymentStrategies.get(paymentType);
        if (strategy == null) {
            throw new IllegalArgumentException("Неизвестный способ оплаты: " + paymentType);
        }
        return strategy;
    }
}
