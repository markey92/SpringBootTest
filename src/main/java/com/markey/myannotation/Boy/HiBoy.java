package com.markey.myannotation.Boy;

public class HiBoy {

    @Boy("小明")
    String name = "world";

    public void sayHello() {
        System.out.println("hi, " + name);
    }
}
