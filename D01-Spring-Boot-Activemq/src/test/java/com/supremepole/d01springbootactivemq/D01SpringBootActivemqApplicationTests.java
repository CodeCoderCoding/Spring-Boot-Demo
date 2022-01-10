package com.supremepole.d01springbootactivemq;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
class D01SpringBootActivemqApplicationTests {
    @Autowired
    JmsComponent jmsComponent;
    @Test
    public void contextLoads() {
        Message msg = new Message();
        msg.setContent("hello activemq!");
        msg.setDate(new Date());
        jmsComponent.send(msg);
    }

}
