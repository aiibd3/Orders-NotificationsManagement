package com.example.ordersnotifications.service.OrderCommand;


import com.example.ordersnotifications.api.model.Order;
import org.springframework.stereotype.Service;

@Service

public abstract class OrderRequest {
    private int accountId;
    private double balance;

    private Order order;
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
