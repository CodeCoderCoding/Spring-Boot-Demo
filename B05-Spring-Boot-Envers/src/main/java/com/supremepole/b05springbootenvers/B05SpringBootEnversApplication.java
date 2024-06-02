package com.supremepole.b05springbootenvers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class B05SpringBootEnversApplication {

    public static void main(String[] args) {
        SpringApplication.run(B05SpringBootEnversApplication.class, args);
    }

}
