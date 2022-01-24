package com.supremepole.f02springbeaninitdestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author CodeCoderCoding
 */
public class BeanAnnotation {
    @PostConstruct
    public void init(){
        System.out.println("Init bean by annotation way.");
    }

    public BeanAnnotation(){
        System.out.println("Constructor in bean annotation.");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy bean by annotation way.");
    }
}
