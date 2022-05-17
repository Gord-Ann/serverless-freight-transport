package com.anna.serverless.freighttransportservice.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArrivalAddress {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private Address arrivalCountry;
    private Address arrivalCity;
}
