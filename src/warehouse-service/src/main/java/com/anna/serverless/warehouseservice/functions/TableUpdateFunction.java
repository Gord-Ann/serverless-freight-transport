package com.anna.serverless.warehouseservice.functions;

import com.anna.serverless.warehouseservice.integration.TransportRestClient;
import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class TableUpdateFunction {

    private final TransportRestClient transportRestClient;

    public void updateTable(UUID id) {
        transportRestClient.updateBD(id);
    }
}
