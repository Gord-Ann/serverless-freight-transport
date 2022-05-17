package com.anna.serverless.freighttransportservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArrivalAddressDto {

    @NotNull
    private UUID id;

    @NotNull
    private AddressDto arrivalCountry;

    @NotNull
    private AddressDto arrivalCity;
}
