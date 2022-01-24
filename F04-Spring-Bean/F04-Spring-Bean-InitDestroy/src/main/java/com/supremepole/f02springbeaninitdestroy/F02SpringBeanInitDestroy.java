package com.supremepole.f02springbeaninitdestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class F02SpringBeanInitDestroy
{
    @SuppressWarnings("unused")
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(InitDestroyConfig.class);
        BeanJavaConfig beanJavaConfig = context.getBean(BeanJavaConfig.class);
        BeanAnnotation beanAnnotation = context.getBean(BeanAnnotation.class);
        context.close();
    }
}
