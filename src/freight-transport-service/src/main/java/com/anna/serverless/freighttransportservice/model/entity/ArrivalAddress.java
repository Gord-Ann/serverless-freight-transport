package com.anna.serverless.freighttransportservice.model.entity;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArrivalAddress {

    private Address arrivalCountry;
    private Address arrivalCity;
}
