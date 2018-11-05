package com.ljx.springboot.aspect;

import org.aspectj.lang.annotation.*;

/**
 * @Auther: jasonliu
 * @Date: 2018/11/5 10:42
 * @Description:
 */
@Aspect
public class MyAspect2 {

    @Pointcut("execution(* com..*.printAnotherUser(..))")
    public void getPointCut() {
    }

    @Before("getPointCut()")
    public void before() {
        System.out.println("MyAspect2 before ..........");
    }

    @After("getPointCut()")
    public void after() {
        System.out.println("MyAspect2 after ..........");
    }

    @AfterReturning("getPointCut()")
    public void afterReturning() {
        System.out.println("MyAspect2 afterReturning..........");
    }

    @AfterThrowing("getPointCut()")
    public void AfterThrowing() {
        System.out.println("MyAspect2 AfterThrowing..........");
    }




}
