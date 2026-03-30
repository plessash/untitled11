package org.example.ex3.decorator.impl;

import org.example.ex3.decorator.Notification;

public class BasicNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Отправка обычного уведомления: " + message);
    }
}
