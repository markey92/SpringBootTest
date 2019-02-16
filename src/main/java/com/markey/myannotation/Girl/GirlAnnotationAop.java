package com.markey.myannotation.Girl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GirlAnnotationAop {

    /**
     * @Before 表示在方法执行前运行切面逻辑
     * value值定义了切点，此次使用注解来指定切点
     * @annotation（参数） 如果自定义的注解不需要参数，则可以为@annotation(类名)
     * && 连接多个指定切点的条件
     * args(name) 用来获取被注解的方法的参数
     */
    @Before(value="@annotation(girl) && args(name)")
    public void dofore(JoinPoint joinPoint,Girl girl, String name) {
        System.out.println("the girl is " + girl.value());
        System.out.println("she will say hello to " + name);
    }
}
