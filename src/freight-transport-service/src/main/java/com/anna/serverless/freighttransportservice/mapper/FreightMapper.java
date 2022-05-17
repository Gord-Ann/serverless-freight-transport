package com.anna.serverless.freighttransportservice.mapper;

import com.anna.serverless.freighttransportservice.model.dto.TransportFreightDto;
import com.anna.serverless.freighttransportservice.model.entity.TransportFreight;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FreightMapper {

    public static List<TransportFreight> mapToModel(List<TransportFreightDto> freights) {
        return freights.stream().map(FreightMapper::mapFreightToModel).collect(Collectors.toList());
    }

    public static TransportFreight mapFreightToModel(TransportFreightDto freight) {
        return TransportFreight.builder()
                .id(freight.getId())
                .name(freight.getName())
                .description(freight.getDescription())
                .quantity(freight.getQuantity())
                .price(freight.getPrice())
                .totalPrice(freight.getTotalPrice())
                .weight(freight.getWeight())
                .build();
    }
}
