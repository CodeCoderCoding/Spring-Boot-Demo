package com.supremepole.a11springboottest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CodeCoderCoding
 */
@RestController
public class TestController {
    @Autowired
    TestService testService;
    @GetMapping("/website")
    public String website(String website) {
        return testService.testService(website);
    }
}
