package org.example.ex3.decorator.impl;

import org.example.ex3.decorator.Notification;

public class SmsDecorator extends NotificationDecorator {

    public SmsDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Дополнительно отправили SMS: " + message);
    }
}
