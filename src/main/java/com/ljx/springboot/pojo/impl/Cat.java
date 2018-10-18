package com.ljx.springboot.pojo.impl;

import com.ljx.springboot.pojo.Animal;
import org.springframework.stereotype.Component;

/**
 * @Auther: jasonliu
 * @Date: 2018/10/18 20:15
 * @Description:
 */
@Component
public class Cat implements Animal {
    @Override
    public void service() {
        System.out.println(this.getClass() + "Cat service!");
    }

    @Override
    public void service(String str) {
        System.out.println(str);
    }
}
