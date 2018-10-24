package com.ljx.springboot.pojo;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Jasonliu on 2018/10/19.
 */
public class DataSource {

    @Value("${database.username}")
    private String username ;

    public void pringUsername() {
        System.out.println(username);
    }
}
