package com.supremepole.e04gatewaylimit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Mono;

import java.util.Objects;

@SpringBootApplication
public class E04GatewayLimitApplication {

    public static void main(String[] args) {
        SpringApplication.run(E04GatewayLimitApplication.class, args);
    }
    @Bean
    public KeyResolver ipKeyResolver() {
        //按IP来限流。
        return exchange -> Mono.just(Objects.requireNonNull(exchange.getRequest().getRemoteAddress()).getHostName());
    }

}
