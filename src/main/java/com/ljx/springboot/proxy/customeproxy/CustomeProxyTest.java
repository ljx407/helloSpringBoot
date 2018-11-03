package com.ljx.springboot.proxy.customeproxy;

/**
 * @Auther: jasonliu
 * @Date: 2018/11/3 11:46
 * @Description:
 */
public class CustomeProxyTest {
    public static void main(String[] args) {

        HelloService helloService = new HelloServiceImpl();
        HelloService proxyBean = (HelloService)ProxyBean.getProxyBean(helloService, new MyInteceptorImpl());
        proxyBean.sayHello("ljx");

    }
}
