package org.example.ex3.chainOfResponsibility;

import org.example.ex3.builder.Order;

import java.math.BigDecimal;

public class OrderAmountValidationHandler extends OrderHandler {

    @Override
    protected void process(Order order) {
        if (order.getAmount() == null || order.getAmount().compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount должна быть больше 0");
        }
        System.out.println("Проверка amount пройдена");
    }
}
