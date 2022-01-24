package com.supremepole.f04springbeanprofile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author CodeCoderCoding
 */
@Configuration
public class ProfileConfig {
    /**
     * Profile为dev时实例化devDemoBean。
     */
    @Bean
    @Profile("dev")
    public DemoBean devDemoBean() {
        return new DemoBean("from development profile");
    }

    /**
     * Profile为prod时实例化prodDemoBean。
     * @return
     */
    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean() {
        return new DemoBean("from production profile");
    }
}
