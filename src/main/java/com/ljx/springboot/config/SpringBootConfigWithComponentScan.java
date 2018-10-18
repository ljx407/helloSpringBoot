package com.ljx.springboot.config;

import com.ljx.springboot.pojo.impl.Cat;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @Auther: jasonliu
 * @Date: 2018/10/18 19:59
 * @Description:
 */
@Configuration
@ComponentScan(
        basePackages = {"com.ljx.springboot.pojo"},
//        lazyInit = false
        excludeFilters = {@ComponentScan.Filter(value = {Cat.class}, type = FilterType.ASSIGNABLE_TYPE)}
)
public class SpringBootConfigWithComponentScan {
}
