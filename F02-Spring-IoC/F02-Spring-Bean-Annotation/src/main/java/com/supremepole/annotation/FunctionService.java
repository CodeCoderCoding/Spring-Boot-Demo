package com.supremepole.annotation;

import org.springframework.stereotype.Service;

/**
 * @author CodeCoderCoding
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello " + word + "!";
    }
}
