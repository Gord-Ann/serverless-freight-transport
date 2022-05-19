package com.anna.serverless.freighttransportservice.integration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient("payment-service")
public interface PaymentRestClient {

    @PutMapping("/payment")
    void createPayment();
}
