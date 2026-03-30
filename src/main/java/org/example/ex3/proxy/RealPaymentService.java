package org.example.ex3.proxy;

import java.math.BigDecimal;

public class RealPaymentService implements PaymentService {

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Выполняем оплату на сумму: " + amount);
    }
}
