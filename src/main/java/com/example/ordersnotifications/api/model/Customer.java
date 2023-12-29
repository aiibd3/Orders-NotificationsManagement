package com.example.ordersnotifications.api.model;

import java.util.List;

public class Customer {

    private int accountId;
    private Double balance;

    public Customer(int accountId, Double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void createAccount(int accountId, double balance) {
        // Implementation for creating an account goes here
    }

    // Updated method to take an Order parameter
    public int getOrderId(Order order) {
        return order.getOrderId();
    }

    // Updated method to take a CompoundOrder parameter
    public int getCompoundOrderId(CompoundOrder compoundOrder) {
        return compoundOrder.getCompoundOrderId();
    }

//    public Order placeOrder(List<Product> products) {
//        // Assuming you have a method to generate a unique order ID
//       //int orderId = getOrderId(new Order()); // Replace with your actual implementation
//       //Order order = new Order(orderId, this, products, false); // Assuming 'false' for 'shipped'
//        // Deduct the total order amount from the customer's balance
//        // Update balance logic goes here
//
//        //return products;
//    }
//
//    public CompoundOrder placeCompoundOrder(List<Order> orders) {
//        // Assuming you have a method to generate a unique compound order ID
//        //int compoundOrderId = getCompoundOrderId(new CompoundOrder()); // Replace with your actual implementation
//        //CompoundOrder compoundOrder = new CompoundOrder(compoundOrderId, orders, false); // Assuming 'false' for 'shipped'
//        // Deduct the total order amount from each customer's balance
//        // Update balance logic goes here
//       // return compoundOrder;
//    }

    public void shipOrder(Order order) {
        // Implementation for shipping a simple order goes here
        // Deduct shipping fees from the customer's balance
        // Update balance logic goes here
    }

    public void shipCompoundOrder(CompoundOrder compoundOrder) {
        // Implementation for shipping a compound order goes here
        // Deduct shipping fees from each customer's balance
        // Update balance logic goes here
    }

    public void cancelOrder(Order order) {
        // Implementation for canceling a simple order goes here
        // Refund the order amount to the customer's balance
        // Update balance logic goes here
    }

    public void cancelShipping(Order order) {
        // Implementation for canceling shipping of a simple order goes here
        // Refund the shipping fees to the customer's balance
        // Update balance logic goes here
    }
}
