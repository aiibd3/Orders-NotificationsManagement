package com.example.ordersnotifications.Repo;

import java.util.Map;

public class NotificationRepo {
    private String customerID;
    private Map<String, String> values;


    public String getRecipient() {
        return String.valueOf(customerID);
    }


    public Map<String, String> getValues() {
        return values;
    }

}

