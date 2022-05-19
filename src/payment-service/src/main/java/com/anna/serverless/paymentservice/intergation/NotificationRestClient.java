package com.anna.serverless.paymentservice.intergation;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient("notification-service")
public interface NotificationRestClient {

    @PutMapping("/notification/sendEmail")
    void confirmPayment();
}
