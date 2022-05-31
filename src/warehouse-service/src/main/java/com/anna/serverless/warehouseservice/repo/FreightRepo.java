package com.anna.serverless.warehouseservice.repo;

import com.anna.serverless.warehouseservice.model.entity.Freight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface FreightRepo extends CrudRepository<Freight, UUID> {

    List<Freight> getAllByStorageId(UUID storageId);
}
