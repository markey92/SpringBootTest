package com.markey.annotations.Girl;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target({ElementType.METHOD}) //基于Spring AOP的注解只能作用在方法上
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Girl {
    String value() default "";
}
