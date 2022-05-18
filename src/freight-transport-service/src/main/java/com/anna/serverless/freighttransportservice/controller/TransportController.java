package com.anna.serverless.freighttransportservice.controller;

import com.anna.serverless.freighttransportservice.functions.CreateNewTransportFunction;
import com.anna.serverless.freighttransportservice.functions.ListTransportFunction;
import com.anna.serverless.freighttransportservice.functions.StatusUpdaterFunction;
import com.anna.serverless.freighttransportservice.model.dto.request.StatusRequest;
import com.anna.serverless.freighttransportservice.model.dto.request.TransportRequest;
import com.anna.serverless.freighttransportservice.model.entity.Customer;
import com.anna.serverless.freighttransportservice.model.entity.Transport;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/transport")
public class TransportController {

    private final ListTransportFunction listTransportFunction;
    private final CreateNewTransportFunction createNewTransportFunction;
    private final StatusUpdaterFunction statusUpdaterFunction;
    private final WebClient webClient;

    @GetMapping("/list/{customerId}")
    public List<Transport> getTransport(@PathVariable UUID customerId) {
        return listTransportFunction.listTransport(customerId);
    }

    @GetMapping("/add")
    public String createTransportPage(Model model) {
        return "add-transport";
    }

    @PutMapping("/add")
    public Mono<Customer> createTransport(TransportRequest transportRequest) {
        createNewTransportFunction.createNewTransport(transportRequest);
        return webClient.post().uri("/payment").retrieve().bodyToMono(Customer.class);
    }

    @PostMapping("/{id}/status")
    public void updateStatus(@PathVariable UUID id, @RequestBody StatusRequest statusRequest) {
        statusUpdaterFunction.updateStatus(id, statusRequest);
    }
}
