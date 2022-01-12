package com.supremepole.e02feignconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: CodeCoderCoding
 */
@RestController
public class FeignController {

    @Autowired
    MyFeignClient myFeignClient;

    @GetMapping("/hello")
    public String index() {
        return myFeignClient.hello();
    }

}