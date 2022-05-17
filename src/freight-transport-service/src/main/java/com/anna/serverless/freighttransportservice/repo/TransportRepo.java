package com.anna.serverless.freighttransportservice.repo;

import com.anna.serverless.freighttransportservice.model.entity.Transport;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface TransportRepo extends CrudRepository<Transport, UUID> {

    List<Transport> findAllByCustomerId(UUID customerId);

}
