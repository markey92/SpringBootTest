package com.markey.annotations.Boy;

import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;

@Service
public class HelloBoy {

    @Boy("小明")
    String name = "world";

    public void sayHello() {
        System.out.println("hello, " + name);
    }

//    @PostConstruct
//    public void init() {
//        //注解注入属性后，会调用@PostConstruct的方法
//        this.sayHello();
//    }
}
