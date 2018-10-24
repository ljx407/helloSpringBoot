package com.ljx.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Auther: jasonliu
 * @Date: 2018/10/18 19:59
 * @Description:
 */
@Configuration
@ComponentScan(
//        lazyInit = false,
//        excludeFilters = {@ComponentScan.Filter(value = {Cat.class}, type = FilterType.ASSIGNABLE_TYPE)},
//        includeFilters = {@ComponentScan.Filter(value = {TestConfig.class}, type = FilterType.ASSIGNABLE_TYPE)},
        basePackages = {"com.ljx.springboot.pojo"}
)
//@PropertySource({"classpath:datasource.properties"})
//@EnableConfigurationProperties(TestConfig.class)
public class SpringBootConfigWithComponentScan {

    @Bean("datasource3")
    public DataSource getDataSource3() {

//        HikariConfig config = new HikariConfig();
//
//        config.setJdbcUrl(url);
//        config.setUsername(username);
//        config.setPassword(password);
//
//        HikariDataSource hikariDataSource = new HikariDataSource(config);
//        return hikariDataSource;
        return null ;
    }


}
