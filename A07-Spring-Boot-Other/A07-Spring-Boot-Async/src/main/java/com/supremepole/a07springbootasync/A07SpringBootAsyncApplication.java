package com.supremepole.a07springbootasync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class A07SpringBootAsyncApplication {

    public static void main(String[] args) {
        SpringApplication.run(A07SpringBootAsyncApplication.class, args);
    }

}
