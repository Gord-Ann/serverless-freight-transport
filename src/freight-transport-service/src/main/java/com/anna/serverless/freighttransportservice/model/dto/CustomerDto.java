package com.anna.serverless.freighttransportservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

    @NotNull
    private UUID id;

    @NotNull
    private String name;

    @NotNull
    private String email;
}
