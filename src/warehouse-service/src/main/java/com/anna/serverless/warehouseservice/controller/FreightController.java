package com.anna.serverless.warehouseservice.controller;

import com.anna.serverless.warehouseservice.functions.ListFreightsFunction;
import com.anna.serverless.warehouseservice.functions.ValidateFreightFunction;
import com.anna.serverless.warehouseservice.model.entity.Freight;
import com.anna.serverless.warehouseservice.model.entity.Storage;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/warehouse")
@AllArgsConstructor
public class FreightController {

    private final ListFreightsFunction listFreightsFunction;
    private final ValidateFreightFunction validateFreightFunction;

    @GetMapping("/list")
    public List<Freight> listFreights(UUID customer) {
        return listFreightsFunction.listFreights(customer);
    }

    @PutMapping("/validate/{id}")
    public Storage validateFreight(@PathVariable UUID id) {
        return validateFreightFunction.validateFreight(id);
    }
}
