package com.ljx.springboot.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/**
 * Created by Jasonliu on 2018/10/20.
 */
@Configuration
@PropertySource({"classpath:datasource.properties"})
@ConfigurationProperties("datasource")
public class DatabaseConfig {

//    @Value("${datasource.url}")
    private String url ;

//    @Value("${datasource.username}")
    private String username ;

//    @Value("${datasource.password}")
    private String password;

    @Autowired
    private Environment env ;

    @Bean("datasource")
    public DataSource getDataSource() {
//        HikariConfig config = new HikariConfig("datasource.properties");
        HikariConfig config = new HikariConfig();
//        config.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/test?useSSL=false");
//        config.setUsername("root");
//        config.setPassword("root");

        String url = env.getProperty("datasource.url");
        String password = env.getProperty("datasource.password");
        String username = env.getProperty("datasource.username");

        config.setJdbcUrl(url);
        config.setUsername(username);
        config.setPassword(password);

        HikariDataSource hikariDataSource = new HikariDataSource(config);
        return hikariDataSource;

    }

    @Bean("dataSourceA")
    public DataSource getDataSourceA() {
//        HikariConfig config = new HikariConfig("datasource.properties");
        HikariConfig config = new HikariConfig();
//        config.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/test?useSSL=false");
//        config.setUsername("root");
//        config.setPassword("root");

        String url = env.getProperty("datasource1.url");
        String password = env.getProperty("datasource1.password");
        String username = env.getProperty("datasource1.username");

        config.setJdbcUrl(url);
        config.setUsername(username);
        config.setPassword(password);

        HikariDataSource hikariDataSource = new HikariDataSource(config);
        return hikariDataSource;

    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
