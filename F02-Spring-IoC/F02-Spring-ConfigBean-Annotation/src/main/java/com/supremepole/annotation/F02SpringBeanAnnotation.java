package com.supremepole.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class F02SpringBeanAnnotation
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class); //1
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class); //2
        System.out.println(useFunctionService.SayHello("World"));
        context.close();
    }
}
