package com.anna.serverless.freighttransportservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FreightTransportServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreightTransportServiceApplication.class, args);
    }

}
