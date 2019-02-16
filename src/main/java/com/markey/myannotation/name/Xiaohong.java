package com.markey.myannotation.name;

import org.springframework.stereotype.Component;

public class Xiaohong {

    @Name("小红")
    static String name;

    public void sayHi() {
        System.out.println("hello, my name is " + name);
    }
}
