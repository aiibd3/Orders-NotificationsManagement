package com.example.ordersnotifications.api.model;

import java.util.List;

public class NotificationQueue {

    List<Notification> notificationList;

    public void addToQueue(Notification notification) {

    }
    public List<Notification> listQueueContents() {
        return notificationList;
    }
}
