package com.anna.serverless.warehouseservice.repo;

import com.anna.serverless.warehouseservice.model.Freight;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface FreightRepo extends CrudRepository<Freight, UUID> {

    List<Freight> getAllByStorageId(UUID storageId);
}
