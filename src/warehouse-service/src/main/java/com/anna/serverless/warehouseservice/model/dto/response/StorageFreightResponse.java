package com.anna.serverless.warehouseservice.model.dto.response;

import com.anna.serverless.warehouseservice.model.entity.Freight;
import com.anna.serverless.warehouseservice.model.entity.Storage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StorageFreightResponse {

    private UUID id;
    private String name;
    private Freight freight;
    private Storage storage;
    private Double price;
    private Double weight;
}
