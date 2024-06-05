package com.supremepole.a07springbootevent.listener;

import com.supremepole.a07springbootevent.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventListener implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent event) {
        String message = event.getMessage();
        // 在这里可以编写事件处理逻辑
        System.out.println("接收到自定义事件，消息内容为：" + message);
    }

}
