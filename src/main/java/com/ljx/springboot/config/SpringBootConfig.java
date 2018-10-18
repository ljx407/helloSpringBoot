package com.ljx.springboot.config;

import com.ljx.springboot.pojo.Animal;
import com.ljx.springboot.pojo.impl.Cat;
import com.ljx.springboot.pojo.Dog;
import org.springframework.context.annotation.Bean;

/**
 * @Auther: jasonliu
 * @Date: 2018/10/18 19:59
 * @Description:
 */
public class SpringBootConfig {

    @Bean("dog")
    public Animal getDog() {
        return new Dog() ;
    }

    @Bean("cat")
    public Animal getCat() {
        return new Cat();
    }
}
