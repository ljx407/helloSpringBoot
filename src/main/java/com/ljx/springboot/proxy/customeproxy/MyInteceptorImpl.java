package com.ljx.springboot.proxy.customeproxy;

import java.lang.reflect.InvocationTargetException;

/**
 * @Auther: jasonliu
 * @Date: 2018/11/3 10:57
 * @Description:
 */
public class MyInteceptorImpl implements MyInteceptor {

    @Override
    public void before() {
        System.out.println("before......");
    }

    @Override
    public void after() {
        System.out.println("after......");
    }

    @Override
    public Object around(MyInvocation invocation) throws InvocationTargetException, IllegalAccessException {
        System.out.println("around before..............");
        Object obj = invocation.proceed();
        System.out.println("around after..............");
        return obj ;
    }

    @Override
    public void afterReturning() {
        System.out.println("afterReturning......");
    }

    @Override
    public void afterThrowing() {
        System.out.println("afterThrowing......");
    }

    @Override
    public boolean useAcount() {
        return true;
    }
}
