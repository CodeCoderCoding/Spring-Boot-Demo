package com.supremepole.e03hystrixfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author: CodeCoderCoding
 */
@RestController
public class FeignController {

    @Autowired
    MyFeignClient myFeignClient;

    @RequestMapping("/hello")
    public String index() {
        return myFeignClient.hello();
    }

}