package com.ljx.springboot.proxy.customeproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: jasonliu
 * @Date: 2018/11/3 11:03
 * @Description:
 */
public class ProxyBean implements InvocationHandler {

    private Object target = null;
    private MyInteceptor inteceptor = null;

    public static Object getProxyBean(Object target, MyInteceptor inteceptor) {
        ProxyBean proxyBean = new ProxyBean();
        proxyBean.target = target;
        proxyBean.inteceptor = inteceptor;
        Object object = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), proxyBean);
        return object;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        boolean exceptionFlag = false;

        MyInvocation myInvocation = new MyInvocation(args, method, target);
        Object retObj = null;

        this.inteceptor.before();
        try {
            if (this.inteceptor.useAcount()) {
                retObj = this.inteceptor.around(myInvocation);
            } else {
                retObj = method.invoke(target, args);
            }
        } catch (Exception e) {
            exceptionFlag = true;
        }
        this.inteceptor.after();
        if (exceptionFlag) {
            this.inteceptor.afterThrowing();
        } else {
            this.inteceptor.afterReturning();
            return retObj;
        }
        return null ;
    }
}
