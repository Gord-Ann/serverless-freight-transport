package com.anna.serverless.warehouseservice.mapper;

import com.anna.serverless.warehouseservice.model.dto.request.StorageFreightRequest;
import com.anna.serverless.warehouseservice.model.dto.response.StorageFreightResponse;
import com.anna.serverless.warehouseservice.model.entity.Storage;
import com.anna.serverless.warehouseservice.model.entity.StorageFreight;

public class StorageMapper {

    public StorageFreightResponse mapToDto(Storage storage){
        return StorageFreightResponse.builder()
                .id(storage.getId())
                .name(storage.getName())
                .build();
    }
}
