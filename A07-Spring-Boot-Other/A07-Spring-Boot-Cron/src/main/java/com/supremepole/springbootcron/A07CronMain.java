package com.supremepole.springbootcron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class A07CronMain {

    public static void main(String[] args) {
        SpringApplication.run(A07CronMain.class, args);
    }

}
