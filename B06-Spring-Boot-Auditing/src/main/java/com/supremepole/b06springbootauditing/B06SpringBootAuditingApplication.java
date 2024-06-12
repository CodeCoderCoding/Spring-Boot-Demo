package com.supremepole.b06springbootauditing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class B06SpringBootAuditingApplication {

    public static void main(String[] args) {
        SpringApplication.run(B06SpringBootAuditingApplication.class, args);
    }

}
