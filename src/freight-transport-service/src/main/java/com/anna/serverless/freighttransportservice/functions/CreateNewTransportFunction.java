package com.anna.serverless.freighttransportservice.functions;

import com.anna.serverless.freighttransportservice.mapper.TransportMapper;
import com.anna.serverless.freighttransportservice.model.dto.request.TransportRequest;
import com.anna.serverless.freighttransportservice.model.dto.response.TransportResponse;
import com.anna.serverless.freighttransportservice.model.entity.Transport;
import com.anna.serverless.freighttransportservice.model.enumertions.Status;

import java.util.UUID;

public class CreateNewTransportFunction {

    public TransportResponse createNewTransport(TransportRequest transportRequest) {
        Transport transport = TransportMapper.mapToModel(transportRequest);
        transport.setLastStatus(Status.RECEIVED);
        transport.setId(UUID.randomUUID());
        return TransportMapper.mapToResponse(transport);
    }
}
