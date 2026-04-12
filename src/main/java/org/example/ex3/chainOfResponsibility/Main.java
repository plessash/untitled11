package org.example.ex3.chainOfResponsibility;

import org.example.ex3.builder.Order;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Order order = Order.builder()
                .id("ORD-1001")
                .customerName("Nikolas Petrushenko")
                .amount(new BigDecimal(250))
                .currency("BYN")
                .build();

        OrderHandler idHandler = new OrderIdValidationHandler();
        OrderHandler amountHandler = new OrderAmountValidationHandler();
        OrderHandler currencyHandler = new OrderCurrencyValidationHandler();

        idHandler.setNext(amountHandler).setNext(currencyHandler);

        idHandler.handle(order);

        System.out.println("Все проверки пройдены. Заказ можно оплачивать.");
    }
}
