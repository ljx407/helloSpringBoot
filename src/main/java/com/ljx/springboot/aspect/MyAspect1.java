package com.ljx.springboot.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

/**
 * @Auther: jasonliu
 * @Date: 2018/11/5 10:42
 * @Description:
 */
@Aspect
@Order(2)
public class MyAspect1 {

    @Pointcut("execution(* com..*.printAnotherUser(..))")
    public void getPointCut() {
    }

    @Before("getPointCut()")
    public void before() {
        System.out.println("MyAspect1 before ..........");
    }

    @After("getPointCut()")
    public void after() {
        System.out.println("MyAspect1 after ..........");
    }

    @AfterReturning("getPointCut()")
    public void afterReturning() {
        System.out.println("MyAspect1 afterReturning..........");
    }

    @AfterThrowing("getPointCut()")
    public void AfterThrowing() {
        System.out.println("MyAspect1 AfterThrowing..........");
    }




}
