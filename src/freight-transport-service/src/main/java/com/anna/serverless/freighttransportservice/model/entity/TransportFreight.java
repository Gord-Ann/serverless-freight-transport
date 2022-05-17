package com.anna.serverless.freighttransportservice.model.entity;

import lombok.*;

import java.util.UUID;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransportFreight {

    private UUID id;
    private String name;
    private String description;
    private Integer quantity;
    private Double weight;
    private Double price;
    private Double totalPrice;
}
