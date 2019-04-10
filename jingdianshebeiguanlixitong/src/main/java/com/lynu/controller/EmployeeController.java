package com.lynu.controller;

import com.lynu.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 天意无情
 * @date 2019-04-09 22:59
 */
@Controller
@RequestMapping("EmployeeController")
public class EmployeeController {


    @Resource
    private EmployeeService employeeService;


    @RequestMapping("chaEmployeeCount")
    @ResponseBody
    public Integer chaEmployeeCount(HttpSession session) {
        Integer integer = employeeService.chaEmployeeCount();
        session.setAttribute("EmployeeCount",integer);
        return integer;
    }




}
