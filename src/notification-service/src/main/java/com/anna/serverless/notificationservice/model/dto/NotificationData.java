package com.anna.serverless.notificationservice.model.dto;

import com.anna.serverless.notificationservice.enumeration.NotificationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class NotificationData {

    @NotNull
    private NotificationType csNotificationType;

    @NotNull
    private CustomerDto customer;

    @NotNull
    private FreightDto freight;

    private List<FreightDto> freights;
}
