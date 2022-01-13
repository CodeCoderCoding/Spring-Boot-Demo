package com.supremepole.e06configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class E06ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(E06ConfigServerApplication.class, args);
    }

}
