package com.anna.serverless.notificationservice.service;

import com.anna.serverless.notificationservice.model.dto.NotificationData;

public interface EmailNotificationService {

    void sendEmailNotification(NotificationData data);
}
