package com.example.ordersnotifications.api.model;

import com.example.ordersnotifications.service.NotificationStrategy.NotificationStrategy;

import java.util.Map;

public class Notification {
    NotificationTemplate template;
    public String recipient;
    //String values;
    private Map<String, String> values;

    public Notification(NotificationTemplate template, String recipient, Map<String, String> values) {
        this.template = template;
        this.recipient = recipient;
        this.values = values;
    }

    public NotificationTemplate getTemplate() {
        return template;
    }

    public void setTemplate(NotificationTemplate template) {
        this.template = template;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public Map<String, String> getValues() {
        return values;
    }

    public void setValues(Map<String, String> values) {
        this.values = values;
    }

    public void sendNotification() {

    }

    public void sendNotification(NotificationStrategy smsStrategy) {
    }
}
