package com.markey.annotations.Boy;

import javax.annotation.PostConstruct;

public class HiBoy {

    @Boy("小明")
    String name = "world";

    public void sayHello() {
        System.out.println("hi, " + name);
    }

    @PostConstruct
    public void init() {
        //注解注入属性后，会调用@PostConstruct的方法
        this.sayHello();
    }

}
