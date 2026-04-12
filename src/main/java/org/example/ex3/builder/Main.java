package org.example.ex3.builder;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Order order = Order.builder()
                .id("123SE32")
                .customerName("Alex Petrushenko")
                .amount(new BigDecimal(350))
                .currency("BYN")
                .build();
    }
}
