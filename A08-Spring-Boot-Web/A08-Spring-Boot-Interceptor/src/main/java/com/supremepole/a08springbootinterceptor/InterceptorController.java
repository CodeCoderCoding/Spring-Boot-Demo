package com.supremepole.a08springbootinterceptor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CodeCoderCoding
 */
@RestController
public class InterceptorController {
    @GetMapping("/myInterceptor")
    public String myInterceptor(){
        return "myInterceptor";
    }
    @GetMapping("/myInterceptor1")
    public String myInterceptor1(){
        return "myInterceptor1";
    }
}
