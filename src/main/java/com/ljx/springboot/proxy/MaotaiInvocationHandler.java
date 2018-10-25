package com.ljx.springboot.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Auther: jasonliu
 * @Date: 2018/10/25 16:55
 * @Description:
 */
public class MaotaiInvocationHandler implements InvocationHandler {

    private Object proxyInstance;

    public MaotaiInvocationHandler(Object proxyInstance) {
        this.proxyInstance = proxyInstance;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是买酒柜台，要开始买酒了！");
        method.invoke(proxyInstance,args);
        System.out.println("我是买酒柜台，买酒结束！");
        return null;
    }
}
