package org.example.ex3.strategy;

import org.example.ex3.strategy.service.PaymentContext;
import org.example.ex3.strategy.service.PaymentStrategyFactory;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        PaymentStrategyFactory paymentStrategyFactory = new PaymentStrategyFactory();
        PaymentContext paymentContext = new PaymentContext(paymentStrategyFactory.getStrategy("CARD"));

        paymentContext.executePayment(new BigDecimal("100"));

        paymentContext.setPaymentStrategy(paymentStrategyFactory.getStrategy("PAYPAL"));
        paymentContext.executePayment(new BigDecimal("200"));

        paymentContext.setPaymentStrategy(paymentStrategyFactory.getStrategy("CASH"));
        paymentContext.executePayment(new BigDecimal("300"));
    }
}
