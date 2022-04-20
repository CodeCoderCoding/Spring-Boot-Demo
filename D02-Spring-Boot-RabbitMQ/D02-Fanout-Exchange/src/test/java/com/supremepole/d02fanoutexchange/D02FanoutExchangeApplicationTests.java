package com.supremepole.d02fanoutexchange;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class D02FanoutExchangeApplicationTests {

    @Autowired
    RabbitTemplate rabbitTemplate;
    @Test
    public void fanoutTest() {
        rabbitTemplate.convertAndSend(FanoutConfig.FANOUTNAME, null, "hello fanout!");
    }

}
