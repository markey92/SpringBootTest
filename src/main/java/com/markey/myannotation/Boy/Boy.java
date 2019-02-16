package com.markey.myannotation.Boy;

import org.springframework.stereotype.Component;
import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Boy {
    String value() default "";
}
