package org.example.ex3.chainOfResponsibility;

import org.example.ex3.builder.Order;

public abstract class OrderHandler {

    private OrderHandler next;

    public OrderHandler setNext(OrderHandler next) {
        this.next = next;
        return next;
    }

    public void handle(Order order) {
        process(order);
        if (next != null) {
            next.handle(order);
        }
    }

    protected abstract void process(Order order);
}

