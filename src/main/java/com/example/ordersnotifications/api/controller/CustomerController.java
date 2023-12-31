package com.example.ordersnotifications.api.controller;

import com.example.ordersnotifications.api.model.CompoundOrder;
import com.example.ordersnotifications.api.model.Customer;
import com.example.ordersnotifications.api.model.Order;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

@Path("/customers")
public class CustomerController {

    @POST
    @Path("/createAccount")
    @Consumes(MediaType.APPLICATION_JSON)
    public String createAccount(CustomerRequest customerRequest) {
        Customer customer = new Customer(customerRequest.getAccountId(), customerRequest.getBalance());
        return "Account created successfully";
    }

    @POST
    @Path("/shipOrder")
    @Consumes(MediaType.APPLICATION_JSON)
    public String shipOrder(ShipOrderRequest shipOrderRequest) {
        Customer customer = new Customer(shipOrderRequest.getAccountId(), shipOrderRequest.getBalance());
        Order order = shipOrderRequest.getOrder();
        customer.shipOrder(order);
        return "Order shipped successfully";
    }

    @POST
    @Path("/shipCompoundOrder")
    @Consumes(MediaType.APPLICATION_JSON)
    public String shipCompoundOrder(ShipCompoundOrderRequest shipCompoundOrderRequest) {
        Customer customer = new Customer(shipCompoundOrderRequest.getAccountId(), shipCompoundOrderRequest.getBalance());
        CompoundOrder compoundOrder = shipCompoundOrderRequest.getCompoundOrder();
        customer.shipCompoundOrder(compoundOrder);
        return "Compound order shipped successfully";
    }

    @POST
    @Path("/cancelOrder")
    @Consumes(MediaType.APPLICATION_JSON)
    public String cancelOrder(CancelOrderRequest cancelOrderRequest) {
        Customer customer = new Customer(cancelOrderRequest.getAccountId(), cancelOrderRequest.getBalance());
        Order order = cancelOrderRequest.getOrder();
        customer.cancelOrder(order);
        return "Order canceled successfully";
    }

    @POST
    @Path("/cancelShipping")
    @Consumes(MediaType.APPLICATION_JSON)
    public String cancelShipping(CancelShippingRequest cancelShippingRequest) {
        Customer customer = new Customer(cancelShippingRequest.getAccountId(), cancelShippingRequest.getBalance());
        Order order = cancelShippingRequest.getOrder();
        customer.cancelShipping(order);
        return "Shipping canceled successfully";
    }

    private static class CustomerRequest {
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

    private static class ShipOrderRequest {
        private int accountId;
        private double balance;
        private Order order;

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

        public Order getOrder() {
            return order;
        }

        public void setOrder(Order order) {
            this.order = order;
        }
    }

    private static class ShipCompoundOrderRequest {
        private int accountId;
        private double balance;
        private CompoundOrder compoundOrder;

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

        public CompoundOrder getCompoundOrder() {
            return compoundOrder;
        }

        public void setCompoundOrder(CompoundOrder compoundOrder) {
            this.compoundOrder = compoundOrder;
        }
    }

    private static class CancelOrderRequest {
        private int accountId;
        private double balance;
        private Order order;

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

        public Order getOrder() {
            return order;
        }

        public void setOrder(Order order) {
            this.order = order;
        }
    }

    private static class CancelShippingRequest {
        private int accountId;
        private double balance;
        private Order order;

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

        public Order getOrder() {
            return order;
        }

        public void setOrder(Order order) {
            this.order = order;
        }
    }
}
