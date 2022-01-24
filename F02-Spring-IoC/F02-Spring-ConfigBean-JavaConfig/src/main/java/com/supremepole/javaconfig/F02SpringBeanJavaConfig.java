package com.supremepole.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class F02SpringBeanJavaConfig
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class); //1
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class); //2
        System.out.println(useFunctionService.SayHello("JavaConfig"));
        context.close();
    }
}
