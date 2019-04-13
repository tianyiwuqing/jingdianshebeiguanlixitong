package com.lynu.service.impl;

import com.lynu.bean.TableEmployee;
import com.lynu.bean.TableEmployeeExample;
import com.lynu.dao.TableDepartmentMapper;
import com.lynu.dao.TableEmployeeMapper;
import com.lynu.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 28449
 * @since 2019-01-28 17:19
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private TableEmployeeMapper tableEmployeeMapper;

    @Resource
    private TableDepartmentMapper departmentMapper;

    @Override
    public boolean login(String user, String password, HttpSession session) {
        TableEmployeeExample tableEmployeeExample=new TableEmployeeExample();
        TableEmployeeExample.Criteria criteria = tableEmployeeExample.createCriteria();
        criteria.andUsernameEqualTo(user);
        criteria.andPasswordEqualTo(password);
        List<TableEmployee> tableEmployees = tableEmployeeMapper.selectByExample(tableEmployeeExample);
            if (tableEmployees!=null&&tableEmployees.size()>0) {
                TableEmployee tableEmployee =tableEmployees.get(0) ;
//                tableEmployee.setDepartment(departmentMapper.selectByPrimaryKey(Integer.parseInt(tableEmployee.getDepartmentId())));
                session.setAttribute("LoginUser", tableEmployee);
                return true;
            }
        return false;
    }



    @Override
    public TableEmployee chaLoginUSer(HttpSession session) {
        TableEmployee loginUser=(TableEmployee)session.getAttribute("LoginUser");
        if (loginUser!=null){
            return loginUser;
        }
        return null;
    }

    @Override
    public boolean returnLogin(HttpSession session) {
        session.removeAttribute("LoginUser");
        if (session.getAttribute("LoginUser")==null){
            return true;
        }
        return false;
    }
}
