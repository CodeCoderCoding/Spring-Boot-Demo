package com.supremepole.springbootcron;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Cron {

    // 每两秒触发一次定时器
    @Scheduled(cron="0/2 * * * * ?")
    public void scheduleMethod(){
        System.out.println("定时器被触发"+new Date());
    }

}
