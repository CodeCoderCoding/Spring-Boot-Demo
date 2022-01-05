package com.supremepole.a10springbootlogback;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author CodeCoderCoding
 */
@RestController
public class LogbackController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogbackController.class);

    @RequestMapping("/logback")
    public String listUser() {
        LOGGER.info("默认的INFO级别的日志");
        return "logback";
    }

}
