package com.anna.serverless.warehouseservice.functions;

import com.anna.serverless.warehouseservice.exceptions.ResourceNotFoundException;
import com.anna.serverless.warehouseservice.model.entity.Storage;
import com.anna.serverless.warehouseservice.repo.StorageRepo;
import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class ValidateFreightFunction {

    private final StorageRepo storageRepo;

    public Storage validateFreight(UUID freight) {
        return storageRepo.findById(freight).orElseThrow(ResourceNotFoundException::new);
    }
}
