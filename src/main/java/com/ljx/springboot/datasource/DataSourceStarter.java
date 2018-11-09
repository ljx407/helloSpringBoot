package com.ljx.springboot.datasource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.sql.DataSource;

@SpringBootApplication
@Slf4j
public class DataSourceStarter implements ApplicationContextAware {


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        DataSource bean = applicationContext.getBean(DataSource.class);
        log.info("bean name -> {}", bean.getClass().getName());

    }

    public static void main(String[] args) {
        SpringApplication.run(DataSourceStarter.class);
    }
}
