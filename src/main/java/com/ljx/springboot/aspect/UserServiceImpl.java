package com.ljx.springboot.aspect;

import com.ljx.springboot.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @Auther: jasonliu
 * @Date: 2018/11/3 15:44
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public void printUser(User user) {
        if (null == user) {
            throw new IllegalArgumentException("User 对象为空请检查入参！");
        }

        System.out.println(String.format("User[id=%s,name=%s]", user.getId(), user.getName()));

    }
}
