package com.ljx.springboot.config;

import com.ljx.springboot.pojo.impl.Cat;
import org.springframework.context.annotation.*;

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
@PropertySource({"classpath:datasource.properties"})
public class SpringBootConfigWithComponentScan {
}
