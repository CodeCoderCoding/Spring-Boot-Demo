package com.supremepole.d01springbootactivemq;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.jms.Queue;

@SpringBootApplication
public class D01SpringBootActivemqApplication {

    public static void main(String[] args) {
        SpringApplication.run(D01SpringBootActivemqApplication.class, args);
    }

    @Bean
    Queue queue() {
        return new ActiveMQQueue("activemq");
    }

}
