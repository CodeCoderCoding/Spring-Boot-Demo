package com.supremepole.e01consulprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class E01ConsulProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(E01ConsulProviderApplication.class, args);
    }

}
