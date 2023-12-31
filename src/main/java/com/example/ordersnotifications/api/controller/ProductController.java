package com.example.ordersnotifications.api.controller;

import com.example.ordersnotifications.api.model.Product;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/products")
public class ProductController {

    private static List<Product> productList = new ArrayList<>();

    @GET
    @Path("/{serialNumber}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product getProductDetails(@PathParam("serialNumber") int serialNumber) {
        for (Product product : productList) {
            if (product.getSerialNumber() == serialNumber) {
                return product;
            }
        }
        return null;
    }

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> listAllProducts() {
        return productList;
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String addProduct(Product product) {
        productList.add(product);
        return "Product added successfully";
    }

    @PUT
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String updateProduct(Product updatedProduct) {
        for (Product product : productList) {
            if (product.getSerialNumber() == updatedProduct.getSerialNumber()) {
                product.setName(updatedProduct.getName());
                product.setVendor(updatedProduct.getVendor());
                product.setCategory(updatedProduct.getCategory());
                product.setPrice(updatedProduct.getPrice());
                product.setRemainingParts(updatedProduct.getRemainingParts());
                return "Product updated successfully";
            }
        }
        return "Product not found";
    }

    @DELETE
    @Path("/delete/{serialNumber}")
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteProduct(@PathParam("serialNumber") int serialNumber) {
        for (Product product : productList) {
            if (product.getSerialNumber() == serialNumber) {
                productList.remove(product);
                return "Product deleted successfully";
            }
        }
        return "Product not found";
    }
}
