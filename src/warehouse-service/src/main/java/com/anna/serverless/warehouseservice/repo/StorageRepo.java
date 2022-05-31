package com.anna.serverless.warehouseservice.repo;

import com.anna.serverless.warehouseservice.model.entity.Storage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StorageRepo extends CrudRepository<Storage, UUID> {

    Storage findStorageByCustomerId(UUID customer);
}
