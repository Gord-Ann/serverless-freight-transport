package com.anna.serverless.warehouseservice.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class TransportFreight {

    @Id
    private UUID id;

    @ManyToOne
    private Freight freight;

    private Double quantity;
}
