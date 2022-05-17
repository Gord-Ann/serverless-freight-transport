package com.anna.serverless.freighttransportservice.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartureAddress{

    private Address departureCity;
    private Address departureCountry;
    private LocalDateTime departureTime;
}