package com.anna.serverless.paymentservice.functions;

import com.anna.serverless.paymentservice.exception.ResourceNotFoundException;
import com.anna.serverless.paymentservice.intergation.NotificationRestClient;
import com.anna.serverless.paymentservice.model.Payment;
import com.anna.serverless.paymentservice.repo.PaymentRepo;
import lombok.AllArgsConstructor;

import java.util.UUID;

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
