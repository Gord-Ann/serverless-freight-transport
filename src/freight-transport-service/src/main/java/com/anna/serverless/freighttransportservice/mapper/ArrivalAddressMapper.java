package com.anna.serverless.freighttransportservice.mapper;

import com.anna.serverless.freighttransportservice.model.dto.ArrivalAddressDto;
import com.anna.serverless.freighttransportservice.model.entity.ArrivalAddress;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ArrivalAddressMapper {

    public static ArrivalAddress mapToModel(ArrivalAddressDto address) {
        return ArrivalAddress.builder()
                .arrivalCountry(AddressMapper.mapToModel(address.getArrivalCountry()))
                .arrivalCity(AddressMapper.mapToModel(address.getArrivalCity()))
                .build();
    }
}
