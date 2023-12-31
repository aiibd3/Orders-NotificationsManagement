package com.example.ordersnotifications.service.OrderCommand;


import org.springframework.stereotype.Service;

@Service

public abstract class OrderRequest {

    private String name;

    private int accountId;
    private double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountId() {
        return accountId;
    }


    public double getBalance() {
        return balance;
    }


}
