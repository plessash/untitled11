package org.example.ex3.adapter;

import org.example.ex3.proxy.PaymentService;

import java.math.BigDecimal;

public class PaymentAdapter implements PaymentService {
    private final LegacyPaymentSystem legacyPaymentSystem;

    public PaymentAdapter(LegacyPaymentSystem legacyPaymentSystem) {
        this.legacyPaymentSystem = legacyPaymentSystem;
    }

    @Override
    public void pay(BigDecimal amount) {
        legacyPaymentSystem.makePayment(amount.doubleValue());
    }
}
