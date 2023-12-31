package com.example.ordersnotifications.service.NotificationStrategy;

import com.example.ordersnotifications.api.model.Notification;
import java.util.Map;

public class EmailNotificationStrategy implements NotificationStrategy {
    @Override
    public void sendNotification(Notification notification) {
        String contentWithValues = substitutePlaceholders(notification);
    }

    private String substitutePlaceholders(Notification notification) {
        String contentWithValues = notification.getTemplate().getContent();

        for (Map.Entry<String, String> entry : notification.getValues().entrySet()) {
            String placeholder = "{" + entry.getKey() + "}";
            String value = entry.getValue();
            contentWithValues = contentWithValues.replace(placeholder, value);
        }
        return contentWithValues;
    }
}
