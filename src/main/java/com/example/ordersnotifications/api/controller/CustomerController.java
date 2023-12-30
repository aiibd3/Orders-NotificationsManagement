package com.example.ordersnotifications.api.controller;

import jakarta.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/users/*")
public class CustomerController extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String pathInfo = request.getPathInfo();
        switch (pathInfo) {
//            case "/pay/mobile":
//                handlePayMobile(request, response);
//                break;
//            case "/pay/internet":
//                handlePayInternet(request, response);
//                break;
//            case "/pay/landline":
//                handlePayLandline(request, response);
//                break;
//            case "/addCash":
//                handleAddCash(request, response);
//                break;
            default:
                response.getWriter().write("Invalid endpoint");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        if (request.getPathInfo().equals("/showWallet")) {
            handleWalletPrint(request, response);
        } else {
            response.getWriter().write("Invalid endpoint");
        }
    }

    private void handlePayMobile(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Extract parameters from request
        int choice = Integer.parseInt(request.getParameter("choice"));
        String amount = request.getParameter("amount");
        int sp = Integer.parseInt(request.getParameter("sp"));
        String ccn = request.getParameter("ccn");

        // Process payment and send response
//        String result = p.payMobile(choice, amount, sp, ccn);
//        response.getWriter().write(result);
    }

    // Similar methods for handlePayInternet, handlePayLandline, handleAddCash, and handleWalletPrint

    private void handleWalletPrint(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        float walletBalance = w.walletPrint();
//        response.getWriter().write(String.valueOf(walletBalance));
    }
}

