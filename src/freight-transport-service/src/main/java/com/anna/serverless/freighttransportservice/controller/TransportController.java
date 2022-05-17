package com.anna.serverless.freighttransportservice.controller;

import com.anna.serverless.freighttransportservice.functions.CreateNewTransportFunction;
import com.anna.serverless.freighttransportservice.functions.ListTransportFunction;
import com.anna.serverless.freighttransportservice.functions.StatusUpdatorFunction;
import com.anna.serverless.freighttransportservice.model.dto.request.StatusRequest;
import com.anna.serverless.freighttransportservice.model.dto.request.TransportRequest;
import com.anna.serverless.freighttransportservice.model.entity.Customer;
import com.anna.serverless.freighttransportservice.model.entity.Transport;
import com.anna.serverless.freighttransportservice.repo.TransportRepo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/transport")
public class TransportController {

    private final ListTransportFunction listTransportFunction;
    private final CreateNewTransportFunction createNewTransportFunction;
    private final StatusUpdatorFunction statusUpdatorFunction;
    private final WebClient webClient;


    @GetMapping("/list")
    public List<Transport> getTransport(UUID customerId) {
        return listTransportFunction.listTransport(customerId);
    }

    @PutMapping("/add")
    public Mono<Customer> createTransport(TransportRequest transportRequest) {
        createNewTransportFunction.createNewTransport(transportRequest);
        return webClient.post().uri("/payment").retrieve().bodyToMono(Customer.class);
    }

    @PostMapping("/{id}/status")
    public void updateStatus(@PathVariable UUID id, @RequestBody StatusRequest statusRequest) {
        statusUpdatorFunction.updateStatus(id, statusRequest);
    }
}
