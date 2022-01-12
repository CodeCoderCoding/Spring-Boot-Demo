package com.supremepole.e03hystrixfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class E03HystrixFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(E03HystrixFeignApplication.class, args);
    }

}
