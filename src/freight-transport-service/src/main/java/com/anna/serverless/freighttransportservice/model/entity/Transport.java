package com.anna.serverless.freighttransportservice.model.entity;

import com.anna.serverless.freighttransportservice.model.enumertions.Status;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID ID;

    private Status lastStatus;

    private DepartureAddress departureCountry;
    private DepartureAddress departureCity;
    private ArrivalAddress arrivalCountry;
    private ArrivalAddress arrivalCity;

    private List<TransportationFreight> freights;

    private Double totalWeight;
    private Double totalPrice;
}
