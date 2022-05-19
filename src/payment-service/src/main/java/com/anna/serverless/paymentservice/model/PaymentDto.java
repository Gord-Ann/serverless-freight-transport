package com.anna.serverless.paymentservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDto {

    private UUID id;
    private UUID orderId;

    private BigDecimal value;

    private String name;
    private String number;
    private String expiration;
    private String code;

    private Payment.Status status;

    public PaymentDto(Payment p) {
        this(p.getId(), p.getOrderId(), p.getTotalValue(), p.getName(), p.getNumber(), p.getExpiration(), p.getCode(), p.getStatus());
    }
}
