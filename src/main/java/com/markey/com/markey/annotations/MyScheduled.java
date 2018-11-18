package com.markey.com.markey.annotations;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component
public class MyScheduled {

    @Scheduled(cron = "0/2 * * * * ?")
    public void task1() {
        Calendar now = Calendar.getInstance();
        System.out.println("hello, i am task1,now:" + now.getTime().toString());
    }
}
