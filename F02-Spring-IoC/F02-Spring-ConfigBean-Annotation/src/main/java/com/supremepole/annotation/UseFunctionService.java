package com.supremepole.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author CodeCoderCoding
 */
@Service
public class UseFunctionService {
    @Autowired //2
    FunctionService functionService;

    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
