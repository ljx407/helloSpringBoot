package com.ljx.springboot.proxy.customeproxy;

import com.ljx.springboot.proxy.customeproxy.HelloService;
import org.springframework.util.StringUtils;

/**
 * @Auther: jasonliu
 * @Date: 2018/11/3 10:44
 * @Description:
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        if (StringUtils.isEmpty(name)) {
            throw new IllegalArgumentException();
        }
        System.out.println(String.format("hello %s", name));
    }
}
