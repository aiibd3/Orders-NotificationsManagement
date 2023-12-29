package com.example.ordersnotifications.api.model;

public class Product {

    public int serialNumber;
    public String name;
    public String vendor;
    public String category;
    public double price;
    public double remainingParts;


    public Product(int serialNumber, String name, String vendor, String category, double price, double remainingParts) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.vendor = vendor;
        this.category = category;
        this.price = price;
        this.remainingParts = remainingParts;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRemainingParts() {
        return remainingParts;
    }

    public void setRemainingParts(double remainingParts) {
        this.remainingParts = remainingParts;
    }


    public String getProductDetails() {
        return "";
    }

}
