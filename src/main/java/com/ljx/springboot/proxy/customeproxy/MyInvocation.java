package com.ljx.springboot.proxy.customeproxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Auther: jasonliu
 * @Date: 2018/11/3 10:49
 * @Description:
 */
public class MyInvocation {

    private Object[] params ;

    private Method method ;

    private Object target ;

    public MyInvocation(Object[] params, Method method, Object target) {
        this.params = params;
        this.method = method;
        this.target = target;
    }

    public Object  proceed() throws InvocationTargetException, IllegalAccessException {
        return method.invoke(target,params);
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }
}
