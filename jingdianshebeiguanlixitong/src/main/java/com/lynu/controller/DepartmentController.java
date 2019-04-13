package com.lynu.controller;

import com.lynu.bean.TableDepartment;
import com.lynu.bean.TableEmployee;
import com.lynu.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.net.ssl.HttpsURLConnection;
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
        return tableDepartments;
    }


    @RequestMapping("delDepartment")
    @ResponseBody
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

    @RequestMapping("chaAllEmployee")
    @ResponseBody
    public List<TableEmployee> chaAllEmployee() {
        return departmentService.chaAllEmployee();
    }

    @RequestMapping("addDepartment")
    @ResponseBody
    public boolean addDepartment(TableDepartment department) {
      return departmentService.addDepartment(department);
    }
    @RequestMapping("chaOfKeyEquipment")
    public String chaOfKeyEquipment(String did, HttpSession session){
        TableDepartment tableDepartment = departmentService.chaOfKeyEquipment(did);
        session.setAttribute("editDepartment",tableDepartment);
        return "management-department-edit";
    }
    @RequestMapping("editEquipment")
    @ResponseBody
    public boolean editEquipment(TableDepartment department) {
       return departmentService.editEquipment(department);
    }
}
