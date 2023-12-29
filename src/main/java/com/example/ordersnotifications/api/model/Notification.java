package com.example.ordersnotifications.api.model;

import java.util.Dictionary;

public class Notification {
    NotificationTemplate template;
    public String recipient;
    Dictionary<String, String> values;


    public Notification(NotificationTemplate template, String recipient, Dictionary<String, String> values) {
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

    public Dictionary<String, String> getValues() {
        return values;
    }

    public void setValues(Dictionary<String, String> values) {
        this.values = values;
    }

    public void sendNotification() {

    }

}
