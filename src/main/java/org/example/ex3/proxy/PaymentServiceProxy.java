package org.example.ex3.proxy;

import java.math.BigDecimal;

public class PaymentServiceProxy implements PaymentService {

    private final PaymentService paymentService;

    public PaymentServiceProxy(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Лог: старт оплаты");
        paymentService.pay(amount);
        System.out.println("Лог: оплата завершена");
    }
}
