package com.supremepole.b04springbootcachesingle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class B04SpringBootCacheSingleApplication {

    public static void main(String[] args) {
        SpringApplication.run(B04SpringBootCacheSingleApplication.class, args);
    }

}
