package com.supremepole.e04gatewayjavaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class E04GatewayJavaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(E04GatewayJavaApiApplication.class, args);
    }
    /**
     * 代码方式实现路由转发
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("spring", r -> r.path("/spring/spring.html")
                        .uri("https://cs.supremepole.com"))
                //注意这里是转发到https://cs.supremepole.com/spring/spring.html
                .build();
    }

}
