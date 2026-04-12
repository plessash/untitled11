package org.example.ex3.chainOfResponsibility;

import org.example.ex3.builder.Order;

public class OrderCurrencyValidationHandler extends OrderHandler {

    @Override
    protected void process(Order order) {
        if (order.getCurrency() == null || order.getCurrency().isBlank()) {
            throw new IllegalArgumentException("Currency обязательна");
        }
        System.out.println("Проверка currency пройдена");
    }
}
