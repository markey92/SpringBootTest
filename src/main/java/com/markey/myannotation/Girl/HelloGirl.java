package com.markey.myannotation.Girl;

import org.springframework.stereotype.Component;

//@Component
public class HelloGirl {

    @Girl("小红")
    public void sayHello(String name) {
        System.out.println("hello, " + name);
    }
}
