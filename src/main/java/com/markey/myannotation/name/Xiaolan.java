package com.markey.myannotation.name;

@Name("小蓝")
public class Xiaolan {

    private String name;

    public Xiaolan() {
        setName(this);
    }

    public void sayHi() {
        System.out.println("hello, my name is " + name);
    }

    public void setName(Xiaolan xiaolan) {
        Class clazz = this.getClass();
        if (clazz.isAnnotationPresent(Name.class)) {
            Name annotation = (Name) clazz.getAnnotation(Name.class);
            xiaolan.name = annotation.value();
            return;
        }
    }
}
