package com.ljx.springboot.aspect;

import com.ljx.springboot.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @Auther: jasonliu
 * @Date: 2018/11/5 10:36
 * @Description:
 */
@Service
public class AnotherUserService {

    public void printAnotherUser(User user) {
        System.out.println("anotherUserServcie ........");
    }

}
