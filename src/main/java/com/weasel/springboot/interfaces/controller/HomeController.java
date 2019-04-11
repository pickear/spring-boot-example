package com.weasel.springboot.interfaces.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Dylan
 * @date 2016/7/20.
 */
@Controller
public class HomeController {

    @RequestMapping("/home")
    public String index(){
        return "home";
    }
}
