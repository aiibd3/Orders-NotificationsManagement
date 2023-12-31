package com.example.ordersnotifications.service.OrderCommand;

public abstract class OrderRequest {
    private int accountId;
    private double balance;


    // getters and setters

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
