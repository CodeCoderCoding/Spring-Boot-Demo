package com.supremepole.springbootcron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class A12CronMain {

    public static void main(String[] args) {
        SpringApplication.run(A12CronMain.class, args);
    }

}
