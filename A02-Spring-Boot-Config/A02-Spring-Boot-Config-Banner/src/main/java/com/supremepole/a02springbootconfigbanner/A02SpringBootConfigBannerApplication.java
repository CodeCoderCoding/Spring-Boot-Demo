package com.supremepole.a02springbootconfigbanner;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class A02SpringBootConfigBannerApplication {

    public static void main(String[] args) {
        // SpringApplication.run(A02SpringBootConfigBannerApplication.class, args);
        SpringApplicationBuilder builder = new SpringApplicationBuilder(A02SpringBootConfigBannerApplication.class);
        builder.bannerMode(Banner.Mode.OFF).run(args);
    }

}
