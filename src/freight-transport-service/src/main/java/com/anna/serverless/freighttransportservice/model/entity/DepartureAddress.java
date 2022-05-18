package com.anna.serverless.freighttransportservice.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DepartureAddress{

    private Address departureCity;
    private Address departureCountry;
    private LocalDateTime departureTime;
}
