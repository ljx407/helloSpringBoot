package com.ljx.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Auther: jasonliu
 * @Date: 2018/10/16 16:31
 * @Description:
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "hello springboot";
    }

    @RequestMapping("/welcome")
    public ModelAndView welcome() {
        ModelAndView view = new ModelAndView();
        view.addObject("name","ljx");
        view.setViewName("welcome");
        return view;
    }
}
