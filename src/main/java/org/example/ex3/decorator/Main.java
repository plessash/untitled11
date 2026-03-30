package org.example.ex3.decorator;

import org.example.ex3.decorator.impl.BasicNotification;
import org.example.ex3.decorator.impl.SmsDecorator;

public class Main {
    public static void main(String[] args) {
        Notification notification = new BasicNotification();

        Notification smsNotification = new SmsDecorator(notification);
        smsNotification.send("Заказ успешно создан");
    }
}
