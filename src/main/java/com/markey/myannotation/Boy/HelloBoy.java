package com.markey.myannotation.Boy;

import org.springframework.stereotype.Service;

@Service
public class HelloBoy {

    @Boy("小明")
    String name = "world";

    public void sayHello() {
        System.out.println("hello, " + name);
    }
}
