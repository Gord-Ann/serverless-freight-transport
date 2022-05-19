package com.anna.serverless.warehouseservice.integration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.UUID;

@FeignClient("freight-transport-service")
public interface TransportRestClient {

    @PutMapping("/transport/{id}")
    void updateBD(@PathVariable UUID id);
}
