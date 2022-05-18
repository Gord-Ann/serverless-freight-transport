package com.anna.serverless.warehouseservice.controller;

import com.anna.serverless.warehouseservice.functions.ListFreightsFunction;
import com.anna.serverless.warehouseservice.model.Freight;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/warehouse")
@AllArgsConstructor
public class FreightController {

    private final ListFreightsFunction listFreightsFunction;

    @GetMapping("/list")
    public List<Freight> listFreights(UUID customer) {
        return listFreightsFunction.listFreights(customer);
    }

    @PutMapping("/validate/{id}")
    public void validateFreight(@PathVariable UUID id) {

    }
}
