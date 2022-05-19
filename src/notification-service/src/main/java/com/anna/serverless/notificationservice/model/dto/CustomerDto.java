package com.anna.serverless.notificationservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class CustomerDto {

    private UUID customerId;
    private String name;
    private String displayUid;
}
