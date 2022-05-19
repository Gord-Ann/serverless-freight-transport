package com.anna.serverless.warehouseservice.repo;

import com.anna.serverless.warehouseservice.model.entity.Storage;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface StorageRepo extends CrudRepository<Storage, UUID> {

    Storage findStorageByCustomerId(UUID customer);
}
