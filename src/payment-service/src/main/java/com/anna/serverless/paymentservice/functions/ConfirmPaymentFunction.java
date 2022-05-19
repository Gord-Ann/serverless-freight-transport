package com.anna.serverless.paymentservice.functions;

import com.anna.serverless.paymentservice.controller.PaymentController;
import com.anna.serverless.paymentservice.exception.ResourceNotFoundException;
import com.anna.serverless.paymentservice.intergation.NotificationRestClient;
import com.anna.serverless.paymentservice.model.Payment;
import com.anna.serverless.paymentservice.model.PaymentDto;
import com.anna.serverless.paymentservice.repo.PaymentRepo;
import lombok.AllArgsConstructor;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@AllArgsConstructor
public class ConfirmPaymentFunction {

    private final PaymentRepo paymentRepo;
    private final NotificationRestClient notificationRestClient;

    public void confirmPayment(UUID id){
        Payment payment = paymentRepo.findById(id).orElseThrow(ResourceNotFoundException::new);
        payment.setStatus(Payment.Status.CONFIRM);
        paymentRepo.save(payment);

        notificationRestClient.confirmPayment();
    }
}
