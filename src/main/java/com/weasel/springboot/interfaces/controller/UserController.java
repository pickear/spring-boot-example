package com.weasel.springboot.interfaces.controller;

import com.weasel.springboot.application.UserService;
import com.weasel.springboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dylan
 * @date 2016/7/20.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/get")
    public User get(){
        return service.getUser();
    }
}
