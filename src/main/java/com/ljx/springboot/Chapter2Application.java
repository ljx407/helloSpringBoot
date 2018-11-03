package com.ljx.springboot;

import com.ljx.springboot.aspect.MyAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Chapter2Application {

    @Bean
    public MyAspect getMyAspect() {
        return new MyAspect();
    }

    public static void main(String[] args) {
        SpringApplication.run(Chapter2Application.class, args);
    }
}
