package com.supremepole.a07springbootevent.controller;

import com.supremepole.a07springbootevent.event.CustomEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CodeCoderCoding
 */
@RestController
public class HelloWorldController {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @RequestMapping("/helloworld")
    public String helloWorld() {
        return "Hello World!";
    }

    @RequestMapping("/event")
    public String event() {
        String message="event message";
        CustomEvent event = new CustomEvent(this, message);
        applicationEventPublisher.publishEvent(event);
        return message;
    }

}
