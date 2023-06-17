package com.supremepole.a09springbootexception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author CodeCoderCoding
 */
@RestControllerAdvice
public class MyExceptionHandler {
    //捕获全局异常,处理所有不可知的异常
    @ExceptionHandler(value=Exception.class)
    //@ResponseBody
    Object handleException(Exception e, HttpServletRequest request){
        System.out.println("url: "+request.getRequestURL()+"msg: "+e.getMessage());
        Map<String, Object> map = new HashMap<>();
        map.put("code", 100);
        map.put("msg", e.getMessage());
        map.put("url", request.getRequestURL());
        return map;
    }
}
