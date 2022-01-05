package com.supremepole.a08springbootservlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class A08SpringBootServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(A08SpringBootServletApplication.class, args);
    }

}
