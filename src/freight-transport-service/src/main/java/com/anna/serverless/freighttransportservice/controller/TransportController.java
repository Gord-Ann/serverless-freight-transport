package com.anna.serverless.freighttransportservice.controller;

import com.anna.serverless.freighttransportservice.functions.CreateNewTransportFunction;
import com.anna.serverless.freighttransportservice.functions.ListTransportFunction;
import com.anna.serverless.freighttransportservice.functions.StatusUpdaterFunction;
import com.anna.serverless.freighttransportservice.integration.PaymentRestClient;
import com.anna.serverless.freighttransportservice.integration.WarehouseRestClient;
import com.anna.serverless.freighttransportservice.model.dto.request.StatusRequest;
import com.anna.serverless.freighttransportservice.model.dto.request.TransportRequest;
import com.anna.serverless.freighttransportservice.model.entity.Transport;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/transport")
public class TransportController {

    private final ListTransportFunction listTransportFunction;
    private final CreateNewTransportFunction createNewTransportFunction;
    private final StatusUpdaterFunction statusUpdaterFunction;
    private final WarehouseRestClient warehouseRestClient;
    private final PaymentRestClient paymentRestClient;

    @GetMapping("/list/{customerId}")
    public List<Transport> getTransport(@PathVariable UUID customerId) {
        return listTransportFunction.listTransport(customerId);
    }

    @GetMapping()
    public String redirectToTransport(Model model) {
        return "transport";
    }

    @GetMapping("/add")
    public String redirectToCreateTransport(Model model) {
        return "add-transport";
    }

    @PostMapping("/add")
    public void createTransport(TransportRequest transportRequest) {
        UUID id = createNewTransportFunction.createNewTransport(transportRequest).getId();
        warehouseRestClient.validateFreights(id);
        paymentRestClient.createPayment();
    }

    @PutMapping("/{id}/status")
    public void updateStatus(@PathVariable UUID id, @RequestBody StatusRequest statusRequest) {
        statusUpdaterFunction.updateStatus(id, statusRequest);
    }
}
