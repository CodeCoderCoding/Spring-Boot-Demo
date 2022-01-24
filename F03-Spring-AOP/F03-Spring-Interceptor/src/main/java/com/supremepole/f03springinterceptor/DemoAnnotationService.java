package com.supremepole.f03springinterceptor;

import org.springframework.stereotype.Service;

/**
 * @author CodeCoderCoding
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void add() {
        System.out.println("add");
    }
}
