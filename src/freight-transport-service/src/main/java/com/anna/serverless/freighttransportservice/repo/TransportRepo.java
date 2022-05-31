package com.anna.serverless.freighttransportservice.repo;

import com.anna.serverless.freighttransportservice.model.entity.Transport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TransportRepo extends CrudRepository<Transport, UUID> {

    List<Transport> findAllByCustomerId(UUID customerId);
}
