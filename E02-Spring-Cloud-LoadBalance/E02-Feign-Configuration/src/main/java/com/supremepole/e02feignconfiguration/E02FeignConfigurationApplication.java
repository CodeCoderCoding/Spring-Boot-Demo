package com.supremepole.e02feignconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class E02FeignConfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(E02FeignConfigurationApplication.class, args);
    }

}
