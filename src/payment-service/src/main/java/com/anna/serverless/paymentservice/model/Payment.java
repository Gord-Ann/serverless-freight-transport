package com.anna.serverless.paymentservice.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    public enum Status {
        CREATED,
        CONFIRM,
        CANCELED
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @NotNull
    @Positive
    private BigDecimal totalValue;

    private String name;
    private String number;
    private String expiration;
    private String code;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;

    private UUID transportId;
}
