package com.anna.serverless.freighttransportservice.integration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.UUID;

@FeignClient("warehouse-service")
public interface WarehouseRestClient {

    @PutMapping("/warehouse/validate/{id}")
    void validateFreights(@PathVariable UUID id);
}
