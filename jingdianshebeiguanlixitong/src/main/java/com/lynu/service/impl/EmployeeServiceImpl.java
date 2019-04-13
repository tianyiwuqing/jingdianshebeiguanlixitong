package com.lynu.service.impl;

import com.lynu.bean.TableDepartment;
import com.lynu.bean.TableEmployee;
import com.lynu.dao.TableDepartmentMapper;
import com.lynu.dao.TableEmployeeMapper;
import com.lynu.service.EmployeeService;
import com.lynu.tools.MathRandomUUID;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author 天意无情
 * @date 2019-04-09 23:12
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    private TableEmployeeMapper employeeMapper;

    @Resource
    private TableDepartmentMapper departmentMapper;

    @Override
    public Integer chaEmployeeCount() {
        int l = (int) employeeMapper.countByExample(null);
        return l;
    }

    @Override
    public boolean addEmployee(TableEmployee employee) {
        employee.setId(Integer.parseInt(MathRandomUUID.UUidRandom(9)));
        employee.setCreateTime(new Date());
        employee.setUpdateTime(new Date());
        employee.setType(1);
        return employeeMapper.insert(employee) > 0;
    }

    @Override
    public List<TableEmployee> chaAllEmployee() {
        List<TableEmployee> tableEmployees = employeeMapper.selectByExample(null);
        TableEmployee tableEmployee = null;
        int size = tableEmployees.size();
        for (int i = 0; i < size; ) {
            tableEmployee = tableEmployees.get(i);
            if (tableEmployee.getDelFlag() == 1) {
                tableEmployees.remove(i);
                size--;
            } else {
                if (tableEmployee.getIsLeader() == 0) {
                    tableEmployee.setIsLeaderStr("员工");
                } else {
                    tableEmployee.setIsLeaderStr("领导");
                }
                if (tableEmployee.getDelFlag() == 0) {
                    tableEmployee.setDelFlagStr("正常");
                } else {
                    tableEmployee.setDelFlagStr("删除");
                }
                if (tableEmployee.getIsValid() == 0) {
                    tableEmployee.setIsValidStr("启用");
                } else {
                    tableEmployee.setIsValidStr("禁用");
                }
                if (tableEmployee.getSex() == 0) {
                    tableEmployee.setSexStr("男");
                } else {
                    tableEmployee.setSexStr("女");
                }
                if (tableEmployee.getDepartmentId().equals("0")) {
                    tableEmployee.setDepartmentName("无");
                } else {
                    TableDepartment tableDepartment = departmentMapper.selectByPrimaryKey(Integer.parseInt(tableEmployee.getDepartmentId()));
                    tableEmployee.setDepartmentName(tableDepartment.getName());
                }
                i++;
            }

        }
        return tableEmployees;
    }

    @Override
    public boolean delEmployee(String eid) {
        TableEmployee tableEmployee = employeeMapper.selectByPrimaryKey(Integer.parseInt(eid));
        tableEmployee.setDelFlag(1);
        return employeeMapper.updateByPrimaryKey(tableEmployee) > 0;
    }

    @Override
    public boolean uodateEmployee(String eid) {
        TableEmployee tableEmployee = employeeMapper.selectByPrimaryKey(Integer.parseInt(eid));
        if(tableEmployee.getIsValid()==1){
            tableEmployee.setIsValid(0);
        }else {
            tableEmployee.setIsValid(1);
        }

        return employeeMapper.updateByPrimaryKey(tableEmployee) > 0;
    }

    @Override
    public TableEmployee chaEmployee(String eid) {
        TableEmployee tableEmployee = employeeMapper.selectByPrimaryKey(Integer.parseInt(eid));
        if (tableEmployee.getIsLeader() == 0) {
            tableEmployee.setIsLeaderStr("员工");
        } else {
            tableEmployee.setIsLeaderStr("领导");
        }
        if (tableEmployee.getDelFlag() == 0) {
            tableEmployee.setDelFlagStr("正常");
        } else {
            tableEmployee.setDelFlagStr("删除");
        }
        if (tableEmployee.getIsValid() == 0) {
            tableEmployee.setIsValidStr("启用");
        } else {
            tableEmployee.setIsValidStr("禁用");
        }
        if (tableEmployee.getSex() == 0) {
            tableEmployee.setSexStr("男");
        } else {
            tableEmployee.setSexStr("女");
        }
        return tableEmployee;
    }

    @Override
    public boolean xiugaiEmployee(TableEmployee employee) {
        TableEmployee tableEmployee = employeeMapper.selectByPrimaryKey(employee.getId());
        if (employee.getNewsex()!=2){
            tableEmployee.setSex(employee.getNewsex());
        }
        if (!employee.getNewdepartmentId().equals("0")){
            tableEmployee.setDepartmentId(employee.getNewdepartmentId());
        }
        tableEmployee.setAddress(employee.getAddress());
        tableEmployee.setPassword(employee.getPassword());
        tableEmployee.setDescription(employee.getDescription());
        tableEmployee.setEmployeename(employee.getEmployeename());
        tableEmployee.setUsername(employee.getUsername());
        tableEmployee.setTelephone(employee.getTelephone());
        return employeeMapper.updateByPrimaryKey(tableEmployee)>0;
    }


}


