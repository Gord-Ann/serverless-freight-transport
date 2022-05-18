package com.anna.serverless.freighttransportservice.functions;

import com.anna.serverless.freighttransportservice.model.dto.request.StatusRequest;
import com.anna.serverless.freighttransportservice.model.entity.Transport;
import com.anna.serverless.freighttransportservice.repo.TransportRepo;
import lombok.AllArgsConstructor;

import javax.persistence.EntityNotFoundException;
import java.util.UUID;

@AllArgsConstructor
public class StatusUpdaterFunction {

    private final TransportRepo transportRepo;

    public void updateStatus(UUID id, StatusRequest statusRequest) {
        Transport transport = transportRepo.findById(id)
                .orElseThrow(EntityNotFoundException::new);
        transport.setLastStatus(statusRequest.getStatus());
        transportRepo.save(transport);
    }
}
