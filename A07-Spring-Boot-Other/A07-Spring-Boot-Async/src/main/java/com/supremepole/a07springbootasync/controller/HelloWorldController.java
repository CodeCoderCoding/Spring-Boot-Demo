package com.supremepole.a07springbootasync.controller;

import com.supremepole.a07springbootasync.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CodeCoderCoding
 */
@RestController
public class HelloWorldController {

    @Autowired
    private AsyncService asyncService;

    // 调用方法和被调用的异步方法不在同一个类中，异步生效
    @RequestMapping("/notSame")
    public String notSame() {
        asyncService.asyncTask();
        // 控制台立马打印相关信息，浏览器立马显示返回值
        // 没有因为asyncTask()而被阻塞
        System.out.println("controller中的helloWorld方法");
        return "hello world";
    }

    // 调用方法和被调用的异步方法在同一个类中，异步不生效
    @RequestMapping("/same")
    public String same() {
        asyncTaskInController();
        // 控制台没有立马打印相关信息，浏览器没有立马显示返回值
        // 因为asyncTask()被阻塞
        System.out.println("controller中的helloWorld方法");
        return "hello world";
    }

    @Async
    public void asyncTaskInController() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        // 3秒后执行
        System.out.println("async task方法");
    }

}
