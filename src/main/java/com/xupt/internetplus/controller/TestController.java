package com.xupt.internetplus.controller;

import com.xupt.internetplus.bean.User;
import com.xupt.internetplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by 张涛 on 2017/4/11.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/config")
    public String testConfig(){
        List<User> users = userService.getAllUser();
        for(User user :users){
            System.out.println(user);
        }
        return "success";
    }
}
