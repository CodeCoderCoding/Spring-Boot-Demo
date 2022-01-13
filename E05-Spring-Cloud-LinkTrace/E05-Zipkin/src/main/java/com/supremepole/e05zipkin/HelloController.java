package com.supremepole.e05zipkin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * @author: CodeCoderCoding
 */
@RestController
public class HelloController {
    private static Logger log = LoggerFactory.getLogger(E05ZipkinApplication.class);
    @Autowired
    private LoadBalancerClient loadBalancer;
    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 获取所有服务提供者
     */
    @GetMapping("/instances-lists")
    public Object instancesLists() {
        return discoveryClient.getInstances("service-provider");
    }

    /**
     * 获取所有注册服务名称
     */
    @GetMapping("/services-lists")
    public Object servicesLists() {
        return discoveryClient.getServices();
    }

    /**
     * 获取所有order,缺省为0
     */
    @GetMapping("/order-lists")
    public Object orderLists() {
        return discoveryClient.description();
    }

    /**
     * 从所有服务中选择一个服务（轮询）
     */
    @GetMapping("/poll-service")
    public Object pollService() {
        return loadBalancer.choose("service-provider").getUri().toString();
    }

    /**
     * 调用服务提供者接口
     */
    @GetMapping("/hello")
    public String hello() {
        ServiceInstance serviceInstance = loadBalancer.choose("service-provider");
        URI uri = serviceInstance.getUri();
        String callService = new RestTemplate().getForObject(uri + "/hello", String.class);
        log.info(callService);
        return callService;
    }
}