package com.lynu.controller;

import com.lynu.bean.TableEmployee;
import com.lynu.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author 28449
 * @since 2019-01-28 17:23
 */
@Controller
@RequestMapping("loginController")
public class LoginController {

    @Resource
    private LoginService loginService;

    @RequestMapping("login")
    public String login(String username, String password,HttpSession session){
        if (loginService.login(username, password,session)){
            return "index";
        }
        return "error";
    }
    @RequestMapping("chaLoginUSer")
    public TableEmployee chaLoginUSer(HttpSession session) {
        TableEmployee tableEmployee = loginService.chaLoginUSer(session);
        return tableEmployee;
    }

    @RequestMapping("returnLogin")
    public String returnLogin(HttpSession session){
        boolean b = loginService.returnLogin(session);
        if (b){
            return "login";
        }
        return "error";
    }
}
