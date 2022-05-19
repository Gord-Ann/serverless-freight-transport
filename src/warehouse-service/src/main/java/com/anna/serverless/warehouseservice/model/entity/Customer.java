package com.anna.serverless.warehouseservice.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Customer {

    @Id
    private UUID id;
}
