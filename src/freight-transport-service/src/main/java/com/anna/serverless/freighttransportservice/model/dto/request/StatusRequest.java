package com.anna.serverless.freighttransportservice.model.dto.request;

import com.anna.serverless.freighttransportservice.model.enumertions.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatusRequest {

    @NotNull
    private Status status;
}
