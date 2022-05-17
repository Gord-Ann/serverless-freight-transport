package com.anna.serverless.freighttransportservice.mapper;

import com.anna.serverless.freighttransportservice.model.dto.request.TransportRequest;
import com.anna.serverless.freighttransportservice.model.dto.response.TransportResponse;
import com.anna.serverless.freighttransportservice.model.entity.Transport;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TransportMapper {

    public static Transport mapToModel(TransportRequest transportRequest) {
        return Transport.builder()
                .customer(CustomerMapper.mapToModel(transportRequest.getCustomer()))
                .arrivalCountry(ArrivalAddressMapper.mapToModel(transportRequest.getArrivalCountry()))
                .arrivalCity(ArrivalAddressMapper.mapToModel(transportRequest.getArrivalCity()))
                .departureCountry(DepartureAddressMapper.mapToModel(transportRequest.getDepartureCountry()))
                .departureCity(DepartureAddressMapper.mapToModel(transportRequest.getDepartureCity()))
                .freights(FreightMapper.mapToModel(transportRequest.getFreights()))
                .totalWeight(transportRequest.getTotalWeight())
                .totalPrice(transportRequest.getTotalPrice())
                .build();
    }

    public static TransportResponse mapToResponse(Transport transport) {
        return TransportResponse.builder()
                .id(transport.getId())
                .arrivalCountry(transport.getArrivalCountry())
                .arrivalCity(transport.getArrivalCity())
                .departureCountry(transport.getDepartureCountry())
                .departureCity(transport.getDepartureCity())
                .lastStatus(transport.getLastStatus())
                .freights(transport.getFreights())
                .totalWeight(transport.getTotalWeight())
                .totalPrice(transport.getTotalPrice())
                .build();
    }
}
