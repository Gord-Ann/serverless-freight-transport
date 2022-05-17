package com.anna.serverless.freighttransportservice.model.dto.request;

import com.anna.serverless.freighttransportservice.model.dto.ArrivalAddressDto;
import com.anna.serverless.freighttransportservice.model.dto.CustomerDto;
import com.anna.serverless.freighttransportservice.model.dto.DepartureAddressDto;
import com.anna.serverless.freighttransportservice.model.dto.TransportFreightDto;
import com.anna.serverless.freighttransportservice.model.entity.TransportFreight;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransportRequest {

    @NotNull
    private CustomerDto customer;

    @NotNull
    private DepartureAddressDto departureCountry;

    @NotNull
    private DepartureAddressDto departureCity;

    @NotNull
    private ArrivalAddressDto arrivalCountry;

    @NotNull
    private ArrivalAddressDto arrivalCity;

    @NotNull
    private List<TransportFreightDto> freights;

    @NotNull
    private Double totalWeight;

    @NotNull
    private Double totalPrice;
}
