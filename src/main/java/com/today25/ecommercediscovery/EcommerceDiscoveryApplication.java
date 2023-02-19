package com.today25.ecommercediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EcommerceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceDiscoveryApplication.class, args);
    }

}
