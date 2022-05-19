package com.anna.serverless.warehouseservice.model.dto;

import com.anna.serverless.warehouseservice.model.entity.Customer;
import com.anna.serverless.warehouseservice.model.entity.Freight;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StorageDto {

    private UUID id;
    private String name;
    private Customer customer;
    private Freight freight;
    private Double quantity;
}
