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
}
