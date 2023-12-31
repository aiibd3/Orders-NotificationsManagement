package com.example.ordersnotifications.service.NotificationStrategy;

import java.util.Map;

public class NotificationRequest {
    private String recipient;
    private Map<String, String> values;

    // getters and setters

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
}

