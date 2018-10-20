package com.ljx.springboot.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @Auther: jasonliu
 * @Date: 2018/10/18 20:01
 * @Description:
 */
@Component
// 若出现DI注入冲突时，已primary的优先，
// 若primary同样有多个类定义了，依然抱错
@Primary
public class Dog implements Animal {
    public Dog() {
        System.out.println("dog init!");
    }

    @Override
    public void service() {
        Random random = new Random();
        System.out.println(String.format("Dog%d service",random.nextInt(10)));
    }

    @Override
    public void service(String str) {
        System.out.println(str);
    }
}
