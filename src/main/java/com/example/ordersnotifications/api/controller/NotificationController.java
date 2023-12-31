package com.example.ordersnotifications.api.controller;

import com.example.ordersnotifications.api.model.Notification;
import com.example.ordersnotifications.api.model.NotificationTemplate;
import com.example.ordersnotifications.service.NotificationStrategy.EmailNotificationStrategy;
import com.example.ordersnotifications.service.NotificationStrategy.NotificationStrategy;
import com.example.ordersnotifications.service.NotificationStrategy.SMSNotificationStrategy;
import com.example.ordersnotifications.service.NotificationStrategy.NotificationRequest;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Path("/notifications")
public class NotificationController {

    private final NotificationStrategy emailStrategy;
    private final NotificationStrategy smsStrategy;

    public NotificationController() {
        this.emailStrategy = new EmailNotificationStrategy();
        this.smsStrategy = new SMSNotificationStrategy();
    }

    @POST
    @Path("/sendEmail")
    @Consumes(MediaType.APPLICATION_JSON)
    public String sendEmailNotification(NotificationRequest request) {
        // Create an email template
        NotificationTemplate emailTemplate = new NotificationTemplate(
                "Email",
                "Order Confirmation",
                "Dear {name}, your booking of the item {item} is confirmed. Thanks for using our store :)",
                Arrays.asList("name", "item"),
                Arrays.asList("English", "Spanish"),
                Arrays.asList("Email")
        );

        // Create an email notification based on the template and request
        Notification emailNotification = new Notification(emailTemplate, request.getRecipient(), request.getValues());

        // Send the email notification using the EmailNotificationStrategy
        emailNotification.sendNotification(emailStrategy);

        return "Email notification sent successfully";
    }

    @POST
    @Path("/sendSMS")
    @Consumes(MediaType.APPLICATION_JSON)
    public String sendSMSNotification(NotificationRequest request) {
        // Create an SMS template
        NotificationTemplate smsTemplate = new NotificationTemplate(
                "SMS",
                "Order Confirmation",
                "Dear {name}, your booking of the item {item} is confirmed. Thanks for using our store :)",
                Arrays.asList("name", "item"),
                Arrays.asList("English", "French"),
                Arrays.asList("SMS")
        );

        // Create an SMS notification based on the template and request
        Notification smsNotification = new Notification(smsTemplate, request.getRecipient(), request.getValues());

        // Send the SMS notification using the SMSNotificationStrategy
        smsNotification.sendNotification(smsStrategy);

        return "SMS notification sent successfully";
    }

}
