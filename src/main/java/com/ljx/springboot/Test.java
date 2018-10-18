package com.ljx.springboot;

import com.ljx.springboot.config.SpringBootConfigWithComponentScan;
import com.ljx.springboot.pojo.DataSource;
import com.ljx.springboot.pojo.Dog;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: jasonliu
 * @Date: 2018/10/18 20:04
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringBootConfigWithComponentScan.class);
        Dog dog = ac.getBean(Dog.class);
        dog.service();

        DataSource ds = ac.getBean(DataSource.class);
        ds.pringUsername();

//
//        Dog dog1 = (Dog)ac.getBean("dog");
//        dog1.service();
//
//        Dog dog2 = ac.getBean("dog", Dog.class);
//        dog2.service();

    }
}
