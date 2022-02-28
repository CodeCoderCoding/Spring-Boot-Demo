package com.supremepole.e01nacosconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author CodeCoderCoding
 */
@FeignClient(name = "Producer")
public interface MyFeignClient  {
    @GetMapping(value = "/hello/{str}")
    public String echo(@PathVariable("str") String str);
}
