package com.supremepole.a11springboottest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
class A11SpringBootTestApplicationTests {
    MockMvc mockMvc;
    @Autowired
    WebApplicationContext wac;
    @Autowired
    TestService testService;
    @Test
    void contextLoads() {
    }
    @Test
    public void test() {
        System.out.println(testService.testService("website"));
    }
}
