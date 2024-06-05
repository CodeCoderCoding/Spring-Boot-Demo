package com.supremepole.a07springbootevent.listener;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationReadyEventListener implements ApplicationListener<ApplicationReadyEvent> {

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        // 在这里编写应用启动后的处理逻辑
        System.out.println("Spring Boot 应用已经启动完成!");
    }

}
