package com.anna.serverless.notificationservice.config;

import com.anna.serverless.notificationservice.enumeration.NotificationType;
import com.anna.serverless.notificationservice.service.strategies.MessageProviderStrategy;
import com.anna.serverless.notificationservice.service.strategies.MessageProviderTransportCreated;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

import static com.anna.serverless.notificationservice.enumeration.NotificationType.NEW_FREIGHT_TRANSPORT_WAS_CREATED;

@Configuration
@AllArgsConstructor
public class EmailConfiguration {

    private MessageProviderTransportCreated messageProviderTransportCreated;

    @Bean
    public Map<NotificationType, MessageProviderStrategy> messageProviderStrategyMap() {
        Map<NotificationType, MessageProviderStrategy> result = new HashMap<>();
        result.put(NEW_FREIGHT_TRANSPORT_WAS_CREATED, messageProviderTransportCreated);
        return result;
    }
}