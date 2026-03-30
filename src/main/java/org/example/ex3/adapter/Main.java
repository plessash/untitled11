package org.example.ex3.adapter;

import org.example.ex3.proxy.PaymentService;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        LegacyPaymentSystem legacyPaymentSystem = new LegacyPaymentSystem();
        PaymentService paymentService = new PaymentAdapter(legacyPaymentSystem);
        paymentService.pay(new BigDecimal(100));
    }
}
