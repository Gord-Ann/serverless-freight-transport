package com.anna.serverless.freighttransportservice.mapper;

import com.anna.serverless.freighttransportservice.model.dto.DepartureAddressDto;
import com.anna.serverless.freighttransportservice.model.entity.DepartureAddress;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DepartureAddressMapper {

    public static DepartureAddress mapToModel(DepartureAddressDto address) {
        return DepartureAddress.builder()
                .departureCountry(AddressMapper.mapToModel(address.getDepartureCountry()))
                .departureCity(AddressMapper.mapToModel(address.getDepartureCity()))
                .build();
    }
}
