package com.example.ordersnotifications.api.controller;

import com.example.ordersnotifications.Repo.NotificationRepo;
import com.example.ordersnotifications.api.model.Notification;
import com.example.ordersnotifications.api.model.NotificationTemplate;
import com.example.ordersnotifications.service.NotificationStrategy.EmailNotificationStrategy;
import com.example.ordersnotifications.service.NotificationStrategy.NotificationStrategy;
import com.example.ordersnotifications.service.NotificationStrategy.SMSNotificationStrategy;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

import java.util.Arrays;

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
    public String sendEmailNotification(NotificationRepo request) {
        // Create an email template for order placement
        NotificationTemplate emailPlacementTemplate = new NotificationTemplate(
                "Email",
                "Order Confirmation",
                "Dear {name}, your booking of the item {item} is confirmed. Thanks for using our store :)",
                Arrays.asList("name", "item"),
                Arrays.asList("Email")
        );

        // Create an email notification based on the template and request
        Notification emailPlacementNotification = new Notification(emailPlacementTemplate, request.getRecipient(), request.getValues());

        // Send the email notification using the EmailNotificationStrategy
        emailPlacementNotification.sendNotification(emailStrategy);

        return "Email notification for order placement sent successfully";
    }

    @POST
    @Path("/sendSMS")
    @Consumes(MediaType.APPLICATION_JSON)
    public String sendSMSNotification(NotificationRepo request) {
        NotificationTemplate smsShipmentTemplate = new NotificationTemplate(
                "SMS",
                "Shipment Confirmation",
                "Dear {name}, your order of the item {item} has been shipped. Thanks for choosing our store :)",
                Arrays.asList("name", "item"),
                Arrays.asList("SMS")
        );
        Notification smsShipmentNotification = new Notification(smsShipmentTemplate, request.getRecipient(), request.getValues());
        smsShipmentNotification.sendNotification(smsStrategy);
        return "SMS notification for order shipment sent successfully";
    }
}
