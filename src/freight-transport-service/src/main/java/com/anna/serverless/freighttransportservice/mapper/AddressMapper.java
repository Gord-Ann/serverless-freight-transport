package com.anna.serverless.freighttransportservice.mapper;

import com.anna.serverless.freighttransportservice.model.dto.AddressDto;
import com.anna.serverless.freighttransportservice.model.entity.Address;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AddressMapper {

    public static Address mapToModel(AddressDto addressDto) {
        return Address.builder()
                .city(addressDto.getCity())
                .country(addressDto.getCountry())
                .build();
    }
}
