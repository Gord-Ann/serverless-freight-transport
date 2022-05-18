package com.anna.serverless.freighttransportservice.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    private Long id;

    private String city;
    private String country;
}
