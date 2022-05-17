package com.anna.serverless.freighttransportservice.model.dto.response;

import com.anna.serverless.freighttransportservice.model.entity.ArrivalAddress;
import com.anna.serverless.freighttransportservice.model.entity.Customer;
import com.anna.serverless.freighttransportservice.model.entity.DepartureAddress;
import com.anna.serverless.freighttransportservice.model.entity.TransportFreight;
import com.anna.serverless.freighttransportservice.model.enumertions.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransportResponse {

    private UUID id;

    private Customer customer;

    private Status lastStatus;

    private DepartureAddress departureCountry;
    private DepartureAddress departureCity;
    private ArrivalAddress arrivalCountry;
    private ArrivalAddress arrivalCity;

    private List<TransportFreight> freights;

    private Double totalWeight;
    private Double totalPrice;
}
