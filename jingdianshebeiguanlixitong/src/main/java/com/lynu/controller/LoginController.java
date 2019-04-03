package com.lynu.controller;

import com.lynu.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * @author 28449
 * @since 2019-01-28 17:23
 */
@Controller
@RequestMapping("LoginController")
public class LoginController {

    @Resource
    private LoginService loginService;

    @RequestMapping("login")
    public String login(@RequestParam("name") String name, @RequestParam("password") String password){
        if (loginService.login(name, password)){
            return "index";
        }
        return "error";
    }





}
