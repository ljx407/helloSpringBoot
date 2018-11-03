package com.ljx.springboot.proxy.customeproxy;

import java.lang.reflect.InvocationTargetException;

/**
 * @Auther: jasonliu
 * @Date: 2018/11/3 10:46
 * @Description:
 */
public interface MyInteceptor {

    void before() ;

    void after() ;

    Object around(MyInvocation invocation) throws InvocationTargetException, IllegalAccessException ;

    void afterReturning() ;

    void afterThrowing() ;

    boolean useAcount() ;
}
