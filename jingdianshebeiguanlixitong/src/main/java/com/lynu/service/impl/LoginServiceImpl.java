package com.lynu.service.impl;

import com.lynu.bean.TableEmployee;
import com.lynu.bean.TableEmployeeExample;
import com.lynu.dao.TableEmployeeMapper;
import com.lynu.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 28449
 * @since 2019-01-28 17:19
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private TableEmployeeMapper tableEmployeeMapper;

    @Override
    public boolean login(String user, String password) {
        TableEmployeeExample employeeExample=new TableEmployeeExample();
        TableEmployeeExample.Criteria criteria = employeeExample.createCriteria();
        criteria.andUsernameEqualTo(user);
        criteria.andPasswordEqualTo(password);
        List<TableEmployee> tableEmployees = tableEmployeeMapper.selectByExample(employeeExample);
        System.out.println("serviceImpl:"+tableEmployees.get(1));
        return tableEmployees.size()>0;
    }
}
