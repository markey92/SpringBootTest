package com.markey.myannotation.name;

import java.lang.reflect.Field;

public abstract class Person {

    public Person() {
        setName(this.getClass());
    }

    public void setName(Class clazz) {
        //处理注解在类上
        if (clazz.isAnnotationPresent(Name.class)) {
            Name annotation = (Name) clazz.getAnnotation(Name.class);
            try {
                Field field = clazz.getDeclaredField("name");
                field.setAccessible(true);
                field.set(this, annotation.value());
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return;
        }
        //处理注解在属性上
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            Name annotation = declaredField.getAnnotation(Name.class);
            if (null == annotation) {
                continue;
            }
            declaredField.setAccessible(true);
            try {
                declaredField.set(this, annotation.value());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
