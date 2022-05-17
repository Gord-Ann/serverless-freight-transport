package com.anna.serverless.freighttransportservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransportFreightDto {

    @NotNull
    private UUID id;

    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    private Integer quantity;

    @NotNull
    private Double weight;

    @NotNull
    private Double price;

    @NotNull
    private Double totalPrice;
}
