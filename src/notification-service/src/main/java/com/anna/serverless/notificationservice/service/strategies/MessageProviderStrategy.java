package com.anna.serverless.notificationservice.service.strategies;

import com.anna.serverless.notificationservice.model.dto.NotificationData;

import org.simplejavamail.api.email.Email;
import org.simplejavamail.email.EmailBuilder;

public interface MessageProviderStrategy {
    String getMessageText(NotificationData data);

    default Email getEmail(String sender, NotificationData data) {
        final String recipient = data.getCustomer().getDisplayUid();
        return EmailBuilder.startingBlank()
                .from(sender)
                .to(recipient)
                .withHTMLText(getMessageText(data))
                .buildEmail();
    }
}
