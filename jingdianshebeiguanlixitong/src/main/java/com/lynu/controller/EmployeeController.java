package com.lynu.controller;

import com.lynu.bean.TableEmployee;
import com.lynu.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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

    @RequestMapping("addEmployee")
    @ResponseBody
    public boolean addEmployee(TableEmployee employee) {
       return employeeService.addEmployee(employee);
    }

    @RequestMapping("chaAllEmployee")
    @ResponseBody
    public List<TableEmployee> chaAllEmployee() {
       return employeeService.chaAllEmployee();
    }

    @RequestMapping("delEmployee")
    @ResponseBody
    public boolean delEmployee(String eid) {
        return employeeService.delEmployee(eid);
    }

    @RequestMapping("uodateEmployee")
    @ResponseBody
    public boolean uodateEmployee(String eid) {
        return employeeService.uodateEmployee(eid);
    }
    @RequestMapping("chaEmployee")
    @ResponseBody
    public String chaEmployee(String eid,HttpSession session) {
        TableEmployee tableEmployee = employeeService.chaEmployee(eid);
        session.setAttribute("tableEmployee",tableEmployee);
        return "management-employee-edit";
    }
}
