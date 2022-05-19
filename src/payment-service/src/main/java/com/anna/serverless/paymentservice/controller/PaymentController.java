package com.anna.serverless.paymentservice.controller;

import com.anna.serverless.paymentservice.functions.ConfirmPaymentFunction;
import com.anna.serverless.paymentservice.functions.CreatePaymentFunction;
import com.anna.serverless.paymentservice.model.Payment;
import com.anna.serverless.paymentservice.model.PaymentDto;
import lombok.AllArgsConstructor;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/payment")
public class PaymentController {

    private final CreatePaymentFunction createPaymentFunction;
    private final ConfirmPaymentFunction confirmPaymentFunction;

    @GetMapping
    public String redirectToCreationPayment(){
        return "payment-create";
    }

    @PostMapping
    public ResponseEntity<EntityModel<PaymentDto>> createPayment(@RequestBody Payment payment,
                                                          UriComponentsBuilder uriBuilder) {
        return createPaymentFunction.create(payment, uriBuilder);
    }

    @PutMapping("/{id}")
    public void confirmPayment(@PathVariable UUID id){
        confirmPaymentFunction.confirmPayment(id);
    }
}
