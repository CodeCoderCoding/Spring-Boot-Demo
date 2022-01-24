package com.supremepole.f03springinterceptor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author CodeCoderCoding
 */
@Configuration
@ComponentScan("com.supremepole.f03springinterceptor")
@EnableAspectJAutoProxy
public class AopConfig {

}