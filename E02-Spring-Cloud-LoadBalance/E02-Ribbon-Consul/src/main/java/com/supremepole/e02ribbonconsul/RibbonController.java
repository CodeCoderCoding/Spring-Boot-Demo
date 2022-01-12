package com.supremepole.e02ribbonconsul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author CodeCoderCoding
 */
@RestController
public class RibbonController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    Date date=new Date();
    SimpleDateFormat sdf=new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
    @GetMapping("/test")
    public void test() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("provider");
        System.out.println(serviceInstance.getHost() + serviceInstance.getPort()+" "+sdf.format(date));
    }
}
