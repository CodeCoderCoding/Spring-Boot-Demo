package com.supremepole.springboottest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CodeCoderCoding
 */
@RestController
public class TestController {
    @Autowired
    TestService testService;
    @PostMapping("/website")
    public String website(@RequestBody WebsiteDTO websiteDTO) {
        return "ok";
    }
}
