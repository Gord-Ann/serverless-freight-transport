package com.anna.serverless.freighttransportservice.repo;

import com.anna.serverless.freighttransportservice.model.entity.Transport;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

interface TransportRepo extends CrudRepository<Transport, UUID> {
}
