package com.supremepole.f02springbeaninitdestroy;

/**
 * @author CodeCoderCoding
 */
public class BeanJavaConfig {
    public void init() {
        System.out.println("Init bean by java config way.");
    }
    public BeanJavaConfig(){
        System.out.println("Constructor in bean annotation.");
    }
    public void destroy(){
        System.out.println("Destroy bean by java config way.");
    }
}
