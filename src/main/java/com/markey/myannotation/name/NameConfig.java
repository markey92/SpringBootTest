package com.markey.myannotation.name;

import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class NameConfig {

    List<Class> classList = new ArrayList<>();

    @PostConstruct
    public void init() {
        classList.add(Xiaohong.class);
        classList.add(Xiaobai.class);
        classList.forEach(e -> setName(e));
    }

    public void setName(Class clazz) {
        //处理注解在类上
        if (clazz.isAnnotationPresent(Name.class)) {
            Name annotation = (Name) clazz.getAnnotation(Name.class);
            try {
                Field field = clazz.getDeclaredField("name");
                field.setAccessible(true);
                field.set(null, annotation.value());
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
                declaredField.set(null, annotation.value());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
