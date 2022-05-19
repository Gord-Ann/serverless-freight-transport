package com.anna.serverless.notificationservice.service.strategies;

import com.anna.serverless.notificationservice.model.dto.FreightDto;
import com.anna.serverless.notificationservice.model.dto.NotificationData;
import com.anna.serverless.notificationservice.service.MessageProviderService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MessageProviderTransportCreated implements MessageProviderStrategy {

    private MessageProviderService messageProviderService;

    @Override
    public String getMessageText(NotificationData data) {
        String content = messageProviderService.getStringTemplate("templates/Email_Template.html");
        FreightDto freight = data.getFreight();
        return fillAddressHtmlTemplate(freight, content);

    }

    private String fillAddressHtmlTemplate(FreightDto freight, String content) {
        return String.format(content, freight);
    }
}
