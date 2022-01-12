package com.supremepole.e03hystrixfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: CodeCoderCoding
 */
@Primary
@FeignClient(name = "service-provider", fallback = HelloHystrix.class)
public interface MyFeignClient {
    @RequestMapping(value = "/hello")
    public String hello();

}