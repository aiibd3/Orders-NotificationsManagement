package com.example.ordersnotifications.service.NotificationStrategy;

import com.example.ordersnotifications.api.model.Notification;

public interface NotificationStrategy {

    void sendNotification(Notification notification);

}
