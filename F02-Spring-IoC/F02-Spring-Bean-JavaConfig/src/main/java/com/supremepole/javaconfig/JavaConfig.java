package com.supremepole.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author CodeCoderCoding
 */
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
