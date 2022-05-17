package com.anna.serverless.freighttransportservice.mapper;

import com.anna.serverless.freighttransportservice.model.dto.CustomerDto;
import com.anna.serverless.freighttransportservice.model.entity.Customer;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CustomerMapper {

    public static Customer mapToModel(CustomerDto customer) {
        return Customer.builder()
                .id(customer.getId())
                .name(customer.getName())
                .email(customer.getEmail())
                .build();
    }
}
