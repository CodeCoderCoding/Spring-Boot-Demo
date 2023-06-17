package com.supremepole.springbootservlet;

import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import javax.servlet.*;

/**
 * CodeCoderCoding
 */
@WebFilter("/filter")
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig){
        System.out.println("myFilter->init");
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("myFilter->doFilter");
        chain.doFilter(request,response);
    }
    @Override
    public void destroy() {
        System.out.println("myFilter->destroy");
    }
}
