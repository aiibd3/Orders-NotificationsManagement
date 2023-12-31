package com.example.ordersnotifications.service.Observer;


import com.example.ordersnotifications.api.model.Customer;
import com.example.ordersnotifications.api.model.NotificationTemplate;
import com.example.ordersnotifications.api.model.Order;

public class MessageData {
    public Order order;

    public Customer customer;

    private NotificationTemplate notificationTemplate;

    public String getMessage() {
        return notificationTemplate.getContent();
    }

}
