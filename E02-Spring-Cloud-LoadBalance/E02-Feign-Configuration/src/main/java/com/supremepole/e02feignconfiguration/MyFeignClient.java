package com.supremepole.e02feignconfiguration;

import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author: CodeCoderCoding
 */
@FeignClient(contextId = "feignClient", name = "service-provider", configuration = FeignConfiguration.class)
public interface MyFeignClient {
    /**
    * Spring MVC注解修改为Feign自带的注解；
    * 使用feign自带的注解@RequestLine；
    */
    @RequestLine("GET /hello")
    public String hello();
}