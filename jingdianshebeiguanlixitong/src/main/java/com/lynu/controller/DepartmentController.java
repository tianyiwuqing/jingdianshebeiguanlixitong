package com.lynu.controller;

import com.lynu.bean.TableDepartment;
import com.lynu.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;


/**
 * @author 天意无情
 * @date 2019-04-12 15:24
 */

@Controller
@RequestMapping("departmentController")
public class DepartmentController {

    @Resource
    private DepartmentService departmentService;

    @RequestMapping("chaAllDepartment")
    @ResponseBody
    public List<TableDepartment> chaAllDepartment() {
        List<TableDepartment> tableDepartments = departmentService.chaAllDepartment();
        for (TableDepartment tableDepartment : tableDepartments) {
            System.out.println(tableDepartment);
        }
        return tableDepartments;
    }


    @RequestMapping("delDepartment")
    public boolean delDepartment(String did) {
        return departmentService.delDepartment(did);
    }

    @RequestMapping("departCount")
    @ResponseBody
    public Integer departCount(HttpSession session) {
        Integer integer = departmentService.departCount();
        session.setAttribute("departCount",integer);
        return integer;
    }
}
