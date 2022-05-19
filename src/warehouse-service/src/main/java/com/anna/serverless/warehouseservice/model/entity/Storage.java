package com.anna.serverless.warehouseservice.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Storage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String name;

    @ManyToOne
    private Customer customer;

    @OneToMany
    private List<Freight> freights;

    private Double quantity;
}
