package com.ljx.springboot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Auther: jasonliu
 * @Date: 2018/10/18 19:59
 * @Description:
 */
@Configuration
@ComponentScan(
//        lazyInit = false,
//        excludeFilters = {@ComponentScan.Filter(value = {Cat.class}, type = FilterType.ASSIGNABLE_TYPE)},
        basePackages = {"com.ljx.springboot.pojo"}
)
@PropertySource({"classpath:datasource.properties"})
public class SpringBootConfigWithComponentScan {
}
