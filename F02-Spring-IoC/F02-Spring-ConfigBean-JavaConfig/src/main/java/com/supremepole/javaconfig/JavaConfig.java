package com.supremepole.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author CodeCoderCoding
 */
//使用@Configuration注解表明当前类是一个配置类，这意味着这个类里可能有0个或者多个@Bean注解
//此处没有使用包扫描，是因为所有的Bean都在此类中定义了
@Configuration
public class JavaConfig {
    @Bean//2
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public UseFunctionService userFunctionService(){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());//3
        return useFunctionService;
    }
//    4:
//    public UserFunctionService userFunctionService(FunctionService functionService){
//        UserFunctionService userFunctionService = new UserFunctionService();
//        userFunctionService.setFunctionService(functionService);
//        return userFunctionService;
//    }
}
