package com.anna.serverless.notificationservice.controller;

import com.anna.serverless.notificationservice.model.dto.NotificationData;
import com.anna.serverless.notificationservice.service.EmailNotificationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/notification")
@AllArgsConstructor
public class EmailNotificationController {

    private EmailNotificationService emailNotificationService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createEmailNotification(@RequestBody NotificationData dataDetails) {
        emailNotificationService.sendEmailNotification(dataDetails);
    }
}
