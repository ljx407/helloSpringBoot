package com.ljx.springboot;

import com.ljx.springboot.aspect.MyAspect;
import com.ljx.springboot.aspect.MyAspect1;
import com.ljx.springboot.aspect.MyAspect2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Chapter2Application {

    @Bean
    public MyAspect getMyAspect() {
        return new MyAspect();
    }

    @Bean
    public MyAspect1 getMyAspect1() {return new MyAspect1();}

    @Bean
    public MyAspect2 getMyAspect2() {return new MyAspect2();}

    public static void main(String[] args) {
        SpringApplication.run(Chapter2Application.class, args);
    }
}
