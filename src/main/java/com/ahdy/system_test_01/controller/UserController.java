package com.ahdy.system_test_01.controller;

import com.ahdy.system_test_01.db.model.User;
import com.ahdy.system_test_01.db.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author: Rocty
 * @Date: 2019-05-05 16:33
 * @Version: 1.0
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public int addUser(User user){
        return userService.addUser(user);
    }

    @ResponseBody
    @RequestMapping(value = "/all", produces = {"application/json;charset=UTF-8"})
    public Object SelectAllUser(){

        return userService.selectAllUser();
    }


    @ResponseBody
    @RequestMapping(value = "/hi", produces = {"application/json;charset=UTF-8"})
    public String hello() {
        return "Hello, SpringBoot!";

    }
}
