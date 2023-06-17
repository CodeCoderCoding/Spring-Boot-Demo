package com.supremepole.a12springbootswagger2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName SwaggerConfig
 * @Description
 * @Author yuzhihua
 * @Date 2022/4/20 20:46
 * @Version 1.0.0
 **/
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.supremepole.a12springbootswagger2.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(
                        new ApiInfoBuilder()
                        .description("Swagger API File")
                        .contact(new Contact("supremepole","https://github.com/CodeCoderCoding", "kneil5778@gmail.com"))
                        .version("V1.0.0")
                        .title("Swagger API File")
                        .build()
                );
    }
}
