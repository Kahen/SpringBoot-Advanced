package com.example.springboot06providerticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Kahen
 */
@EnableEurekaClient
@SpringBootApplication
public class Springboot06ProviderTicketApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot06ProviderTicketApplication.class, args);
    }

}
