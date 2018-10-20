package com.ljx.springboot.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Jasonliu on 2018/10/20.
 */
@Component
public class Person {

    @Autowired
    // 若出现有多个实例可出入时，通过qualifier去进一步指定需要注入的类
    @Qualifier("cat")
    private Animal animal;

    public void service() {
        animal.service();
    }
}
