package com.lynu.service.impl;


import com.lynu.bean.TableDepartment;
import com.lynu.bean.TableEmployee;
import com.lynu.dao.TableDepartmentMapper;
import com.lynu.dao.TableEmployeeMapper;
import com.lynu.service.DepartmentService;
import com.lynu.tools.MathRandomUUID;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author 天意无情
 * @date 2019-04-12 15:25
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {


    @Resource
    private TableDepartmentMapper departmentMapper;

    @Resource
    private TableEmployeeMapper employeeMapper;


    @Override
    public List<TableDepartment> chaAllDepartment() {
        List<TableDepartment> tableDepartments = departmentMapper.selectByExample(null);
        for (TableDepartment tableDepartment : tableDepartments) {
            tableDepartment.setEmployee(employeeMapper.selectByPrimaryKey(Integer.parseInt(tableDepartment.getOwnemployee())));
            if (tableDepartment.getIsDelete()==0){
                tableDepartment.setIsDeleteStr("正常");
            }else {
                tableDepartment.setIsDeleteStr("作废");
            }
        }
        return tableDepartments;
    }

    @Override
    public boolean delDepartment(String did) {
        TableDepartment tableDepartment = departmentMapper.selectByPrimaryKey(Integer.parseInt(did));
        tableDepartment.setIsDelete(1);
        return departmentMapper.updateByPrimaryKey(tableDepartment)>0;
    }

    @Override
    public Integer departCount() {
        int l = (int) departmentMapper.countByExample(null);
        return l;
    }

    @Override
    public List<TableEmployee> chaAllEmployee() {
        return employeeMapper.selectByExample(null);
    }

    @Override
    public boolean addDepartment(TableDepartment department) {
        department.setId(Integer.parseInt(MathRandomUUID.UUidRandom(9)));
        department.setIsDelete(0);
        department.setCreateTime(new Date());
        department.setUpdateTime(new Date());
        TableEmployee employee = employeeMapper.selectByPrimaryKey(Integer.parseInt(department.getOwnemployee()));
        employee.setDepartmentId(department.getId().toString());
        employee.setIsLeader(1);
        int i = employeeMapper.updateByPrimaryKey(employee);
        int insert = departmentMapper.insert(department);
        return i+insert>insert;
    }

    @Override
    public TableDepartment chaOfKeyEquipment(String did) {
        return departmentMapper.selectByPrimaryKey(Integer.parseInt(did));
    }

    @Override
    public boolean editEquipment(TableDepartment department) {
        if (!department.getNewownemployee().equals("0")){
            department.setOwnemployee(department.getNewownemployee());
        }
        if (!department.getNewisDelete().equals("0")){
            department.setIsDelete(department.getNewisDelete());
        }
        department.setUpdateTime(new Date());
        return departmentMapper.updateByPrimaryKey(department)>0;
    }
}
