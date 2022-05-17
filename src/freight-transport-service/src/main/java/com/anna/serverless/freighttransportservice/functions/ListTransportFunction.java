package com.anna.serverless.freighttransportservice.functions;

import com.anna.serverless.freighttransportservice.model.entity.Transport;
import com.anna.serverless.freighttransportservice.repo.TransportRepo;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
public class ListTransportFunction {

    private final TransportRepo transportRepo;

    public List<Transport> listTransport(UUID customerId) {
        return transportRepo.findAllByCustomerId(customerId);
    }
}
