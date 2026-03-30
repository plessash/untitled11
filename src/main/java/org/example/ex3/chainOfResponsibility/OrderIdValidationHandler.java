package org.example.ex3.chainOfResponsibility;

import org.example.ex3.builder.Order;

public class OrderIdValidationHandler extends OrderHandler {

    @Override
    protected void process(Order order) {
        if (order.getId() == null || order.getId().isBlank()) {
            throw new IllegalArgumentException("Order id обязателен");
        }
        System.out.println("Проверка id пройдена");
    }
}
