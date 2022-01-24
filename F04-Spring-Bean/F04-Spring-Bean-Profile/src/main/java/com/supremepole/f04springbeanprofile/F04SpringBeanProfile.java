package com.supremepole.f04springbeanprofile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class F04SpringBeanProfile
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        //先将活动的Profile设置为prod
        context.getEnvironment().setActiveProfiles("dev");

        //后置注册Bean配置类，不然会报Bean未定义的错误。
        context.register(ProfileConfig.class);

        //刷新容器
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());

        context.close();
    }
}
