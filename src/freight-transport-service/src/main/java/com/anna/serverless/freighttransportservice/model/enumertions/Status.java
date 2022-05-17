package com.anna.serverless.freighttransportservice.model.enumertions;

public enum Status {

    RECEIVED(1, "RECEIVED"),
    PAID(2, "PAID"),
    ON_THE_WAY(4, "ON_THE_WAY"),
    DELIVERED(5, "DELIVERED");

    private final Integer id;
    private final String value;

    Status(Integer id, String value) {
        this.id = id;
        this.value = value;
    }
}
