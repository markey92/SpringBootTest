package com.markey.myannotation.name;


public class Xiaolan extends Person{

    @Name("小蓝")
    private String name;

    public void sayHi() {
        System.out.println("hello, my name is " + name);
    }
}
