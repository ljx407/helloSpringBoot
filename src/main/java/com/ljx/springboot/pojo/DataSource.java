package com.ljx.springboot.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Jasonliu on 2018/10/19.
 */
@Component
public class DataSource {

    @Value("${database.username}")
    private String username ;

    public void pringUsername() {
        System.out.println(username);
    }
}
