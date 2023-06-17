package com.supremepole.springbootservlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class A03SpringBootServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(A03SpringBootServletApplication.class, args);
    }

}
