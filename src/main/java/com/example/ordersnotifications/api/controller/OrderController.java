package com.example.ordersnotifications.api.controller;

import com.example.ordersnotifications.api.model.CompoundOrder;
import com.example.ordersnotifications.api.model.Customer;
import com.example.ordersnotifications.api.model.Order;
import com.example.ordersnotifications.api.model.Product;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/orders")
public class OrderController {

    @POST
    @Path("/placeOrder")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Order placeOrder(OrderRequest orderRequest) {
        Customer customer = new Customer(orderRequest.getAccountId(), orderRequest.getBalance());
        List<Product> products = orderRequest.getProducts();
        Order order = customer.placeOrder(products);
        return order;
    }

    @POST
    @Path("/placeCompoundOrder")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public CompoundOrder placeCompoundOrder(CompoundOrderRequest compoundOrderRequest) {
        Customer customer = new Customer(compoundOrderRequest.getAccountId(), compoundOrderRequest.getBalance());
        List<Order> orders = compoundOrderRequest.getOrders();
        CompoundOrder compoundOrder = customer.placeCompoundOrder(orders);
        return compoundOrder;
    }

    private static class OrderRequest {
        private int accountId;
        private double balance;
        private List<Product> products;

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

        public List<Product> getProducts() {
            return products;
        }

        public void setProducts(List<Product> products) {
            this.products = products;
        }
    }

    private static class CompoundOrderRequest {
        private int accountId;
        private double balance;
        private List<Order> orders;

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

        public List<Order> getOrders() {
            return orders;
        }

        public void setOrders(List<Order> orders) {
            this.orders = orders;
        }
    }
}
