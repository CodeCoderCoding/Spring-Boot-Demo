package com.supremepole.springbootservlet;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * CodeCoderCoding
 */
@WebListener
public class MyListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("myListener->requestDestroyed");
    }
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("myListener->requestInitialized");
    }
}
