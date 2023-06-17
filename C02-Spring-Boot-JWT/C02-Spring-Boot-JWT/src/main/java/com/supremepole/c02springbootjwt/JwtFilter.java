package com.supremepole.c02springbootjwt;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName JwtFilter
 * @Description
 * @Date 2022/5/12 20:04
 * @Version 1.0.0
 **/
@WebFilter(urlPatterns = "/testToken", filterName = "jwtFilter")
public class JwtFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        response.setHeader("Access-Control-Allow-Origin", "*");
        String token= request.getHeader("Authorization");
        User user = new User();
        user.setId("1");
        user.setUsername("SupremePole");
        user.setPassword("https://cs.supremepole.com");
        boolean flag = JwtUtil.isVerify(token,user);
        if (flag){
            filterChain.doFilter(servletRequest,servletResponse);
        }else {
            System.out.println("失败。。。。。。。。");
            response.getWriter().write("失败。。。。。。。。");
        }
    }

    @Override
    public void destroy() {

    }
}
