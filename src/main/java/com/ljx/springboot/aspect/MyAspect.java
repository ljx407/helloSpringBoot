package com.ljx.springboot.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

/**
 * @Auther: jasonliu
 * @Date: 2018/11/3 15:39
 * @Description:
 */
@Aspect
@Order(1)
public class MyAspect {

    @Pointcut("execution(* com..*.printUser(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before() {
        System.out.println("before......");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("after.....");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("around before......");
        jp.proceed();
        System.out.println("around after......");
    }

    @AfterReturning("pointCut()")
    public void afterReturning() {
        System.out.println("afterreturning......");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing() {
        System.out.println("afterThrowing......");
    }
}
