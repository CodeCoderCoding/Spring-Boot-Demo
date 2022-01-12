package com.supremepole.e03hystrixfeign;

import org.springframework.stereotype.Component;

/**
 * @author: CodeCoderCoding
 */
@Component
public class HelloHystrix implements MyFeignClient {
    @Override
    public String hello() {
        return "出现错误 ";
    }
}