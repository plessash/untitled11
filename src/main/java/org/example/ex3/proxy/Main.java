package org.example.ex3.proxy;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentServiceProxy(new RealPaymentService());
        paymentService.pay(new BigDecimal("100.00"));
    }
}
