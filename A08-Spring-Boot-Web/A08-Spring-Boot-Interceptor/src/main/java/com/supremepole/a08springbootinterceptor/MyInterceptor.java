package com.supremepole.a08springbootinterceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * CodeCoderCoding
 * 创建拦截器
 * 拦截器中的方法按照preHandle -> Controller -> postHandle -> afterCompletion的执行顺序
 */
public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler){
        System.out.println("myInterceptor->preHandle");
        return true;
    }
    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler,
                           ModelAndView modelAndView){
        System.out.println("myInterceptor->postHandle");
    }
    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response,
                                Object handler,
                                Exception ex){
        System.out.println("myInterceptor->afterCompletion");
    }
}
