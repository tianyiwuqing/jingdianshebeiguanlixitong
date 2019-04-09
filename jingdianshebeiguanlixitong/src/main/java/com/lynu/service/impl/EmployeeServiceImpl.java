package com.lynu.service.impl;

import com.lynu.dao.TableEmployeeMapper;
import com.lynu.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 天意无情
 * @date 2019-04-09 23:12
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    private TableEmployeeMapper employeeMapper;

    @Override
    public Integer chaEmployeeCount() {
        int l = (int)employeeMapper.countByExample(null);
        return l;
    }
}
