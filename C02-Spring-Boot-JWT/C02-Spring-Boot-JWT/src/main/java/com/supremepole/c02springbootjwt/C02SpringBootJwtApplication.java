package com.supremepole.c02springbootjwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class C02SpringBootJwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(C02SpringBootJwtApplication.class, args);
    }

}
