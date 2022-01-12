package com.supremepole.e02feignconsul;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author CodeCoderCoding
 */
@FeignClient(name="service-provider")
public interface MyFeignClient {
    @RequestMapping("/hello")
    public String hello();
}
