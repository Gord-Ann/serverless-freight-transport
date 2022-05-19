package com.anna.serverless.paymentservice.repo;

import com.anna.serverless.paymentservice.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface PaymentRepo extends JpaRepository<Payment, Long> {

    Optional<Payment> findById(UUID id);
}
