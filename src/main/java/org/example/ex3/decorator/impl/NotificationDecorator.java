package org.example.ex3.decorator.impl;

import org.example.ex3.decorator.Notification;

public abstract class NotificationDecorator implements Notification {

    protected final Notification notification;

    public NotificationDecorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send(String message) {
        notification.send(message);
    }
}
