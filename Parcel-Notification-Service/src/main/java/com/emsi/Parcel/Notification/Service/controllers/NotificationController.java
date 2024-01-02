package com.emsi.Parcel.Notification.Service.controllers;

import com.emsi.Parcel.Notification.Service.beans.Parcel;
import com.emsi.Parcel.Notification.Service.services.EmailService;
import com.emsi.Parcel.Notification.Service.services.NotificationService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/notification")
public class NotificationController {

    private final NotificationService notificationService;
    private final EmailService emailService;

    @GetMapping("/email")
    public void sendEmail(String to, String subject, String text) {
        to="ahmedaittaleb999@gmail.com";
        subject="Parcel Delivered Successfully";
        text="Your parcel with tracking number F123456 has been delivered successfully!";
        emailService.sendEmail(to, subject, text);
    }

    @GetMapping("/parcels")
    public List<Parcel> getAllParcels() {
        return notificationService.getAllParcels();
    }
    @GetMapping()
    public String HelloWorld(){
        return "Hello World";
    }
}
