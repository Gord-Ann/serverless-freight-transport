package com.anna.serverless.paymentservice.functions;

import com.anna.serverless.paymentservice.model.Payment;
import com.anna.serverless.paymentservice.model.PaymentDto;
import com.anna.serverless.paymentservice.repo.PaymentRepo;
import lombok.AllArgsConstructor;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@AllArgsConstructor
public class CreatePaymentFunction {

    private final PaymentRepo paymentRepo;

    public ResponseEntity<EntityModel<PaymentDto>> create(Payment payment,
                                                          UriComponentsBuilder uriBuilder) {
        payment.setStatus(Payment.Status.CREATED);
        Payment paymentUpdate = paymentRepo.save(payment);

        URI path = uriBuilder.path("/payment/{id}").buildAndExpand(paymentUpdate.getId()).toUri();
        PaymentDto dto = new PaymentDto(paymentUpdate);

        return ResponseEntity.created(path).body(EntityModel.of(dto));
    }
}
