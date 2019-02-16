package com.markey.myannotation.name;

@Name("小绿")
public class Xiaolv extends Person{

    private String name;

    public void sayHi() {
        System.out.println("hello, my name is " + name);
    }
}
