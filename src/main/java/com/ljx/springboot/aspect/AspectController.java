package com.ljx.springboot.aspect;

import com.ljx.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: jasonliu
 * @Date: 2018/11/3 15:49
 * @Description:
 */
@Controller
public class AspectController {

    @Autowired
    private UserService userServiceImpl;

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(User user) {

        userServiceImpl.printUser(user);
        return user ;
    }
}
