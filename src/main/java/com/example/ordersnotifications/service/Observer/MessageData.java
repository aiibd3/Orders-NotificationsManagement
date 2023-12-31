package com.example.ordersnotifications.service.Observer;


import com.example.ordersnotifications.api.model.Customer;
import com.example.ordersnotifications.api.model.NotificationTemplate;
import com.example.ordersnotifications.api.model.Order;

public class MessageData {
    public Order order;

    public Customer customer;

    private NotificationTemplate notificationTemplate;

    public Order getOrder() {
        return order;
    }

    public String getMessage() {
        return notificationTemplate.getContent();
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
