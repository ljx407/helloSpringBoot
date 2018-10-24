package com.ljx.springboot.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by Jasonliu on 2018/10/20.
 */
@Component
@PropertySource("classpath:test.properties")
@ConfigurationProperties(prefix = "test")
@Setter
@Getter
public class TestConfig {

    private String usr;
    private String pwd ;
}
