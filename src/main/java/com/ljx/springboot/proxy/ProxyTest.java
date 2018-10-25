package com.ljx.springboot.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Auther: jasonliu
 * @Date: 2018/10/25 16:52
 * @Description:
 */
public class ProxyTest {

    public static void main(String[] args) {
        MaotaiJiu maotaiJiu = new MaotaiJiu();
        MaotaiProxy maitaiProxy = new MaotaiProxy(maotaiJiu);
        maitaiProxy.attend();
        maitaiProxy.maijiu();

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        InvocationHandler maitaiInvocationHandler = new MaotaiInvocationHandler(maotaiJiu);
        SellWine o = (SellWine)Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), maotaiJiu.getClass().getInterfaces(), maitaiInvocationHandler);
        o.attend();
        o.maijiu();
    }
}
