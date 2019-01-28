package com.lynu.service.impl;

import com.lynu.bean.TableEmployee;
import com.lynu.dao.TableEmployeeMapper;
import com.lynu.service.TableEmployeeServcie;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 28449
 * @since 2019-01-21 16:40
 */
@Service
public class TableEmployeeServcieImpl implements TableEmployeeServcie {


    @Resource
    private TableEmployeeMapper employeeMapper;

    @Override
    public boolean insertEmployee(TableEmployee employee) {
        return employeeMapper.insert(employee)>0;
    }
}
