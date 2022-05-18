package com.anna.serverless.warehouseservice.functions;

import com.anna.serverless.warehouseservice.model.Freight;
import com.anna.serverless.warehouseservice.repo.FreightRepo;
import com.anna.serverless.warehouseservice.repo.StorageRepo;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
public class ListFreightsFunction {

    private final FreightRepo freightRepo;
    private final StorageRepo storageRepo;

    public List<Freight> listFreights(UUID customer) {
        return freightRepo.getAllByStorageId(storageRepo.findStorageByCustomerId(customer).getId());
    }
}
