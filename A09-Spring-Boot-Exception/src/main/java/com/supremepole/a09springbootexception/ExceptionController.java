package com.supremepole.a09springbootexception;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CodeCoderCoding
 */
@RestController
public class ExceptionController {
    @RequestMapping(value="/exception")
    public String exception(){
        int i=1/0;
        return "exception";
    }
    @RequestMapping(value="/no-exception")
    public String noException(){
        return "no exception";
    }

}
