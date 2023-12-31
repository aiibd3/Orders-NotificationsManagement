package com.example.ordersnotifications.service.Observer;

import com.example.ordersnotifications.api.model.Order;

public class SMSObserver implements MessageObserver {
    public Order order;

    public SMSObserver(Order smsApi) {
        this.order = smsApi;
    }

    @Override
    public void sendMassage(MessageData messageData) {
        int name = messageData.customer.getName();
        String message = messageData.getMessage();
    }
}