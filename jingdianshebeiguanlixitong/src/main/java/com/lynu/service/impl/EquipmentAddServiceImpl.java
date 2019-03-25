package com.lynu.service.impl;

import com.lynu.bean.*;
import com.lynu.dao.*;
import com.lynu.service.EquipmentAddService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author 天意无情
 * @date 2019-03-13 8:43
 */
@Service
public class EquipmentAddServiceImpl implements EquipmentAddService {

    @Resource
    private TableEquipmentMapper equipmentMapper;

    @Resource
    private TableDepartmentMapper departmentMapper;

    @Resource
    private TableEmployeeMapper employeeMapper;

    @Resource
    private TableStorageMapper tableStorageMapper;

    @Resource
    private TableFurnishMapper furnishMapper;

    @Resource
    private TableManufacturerMapper manufacturerMapper;

    @Resource
    private TableEquipmentTypeMapper equipmentTypeMapper;

    @Resource
    private TableAddequipmentbillsMapper addequipmentbillsMapper;


    @Resource
    private TableEquipmentDetalisMapper equipmentDetalisMapper;


    @Override
    public boolean addEquipment(TableAddequipmentbills addequipmentbills, String count) {
        TableEquipment equipment = addequipmentbills.getEquipment();
        equipment.getEquipmentDetalis().setCreateTime(new Date());
        equipment.getEquipmentDetalis().setUpdateTime(new Date());
        //查询设备表中是否有设备属性
        TableEquipmentExample equipmentExample = new TableEquipmentExample();
        TableEquipmentExample.Criteria criteria = equipmentExample.createCriteria();
        criteria.andEquipmentNameEqualTo(equipment.getEquipmentName());
        criteria.andEquipmentStandardEqualTo(equipment.getEquipmentStandard());
        List<TableEquipment> tableEquipments = equipmentMapper.selectByExample(equipmentExample);
        //如果有设备表中有设备属性就只添加添加设备表，否者都三张表都参加信息
        if (tableEquipments.size() > 1) {
            return addequipmentbillsMapper.insert(addequipmentbills)>0;
        } else {
            int insert = addequipmentbillsMapper.insert(addequipmentbills);
            int insert1 = equipmentMapper.insert(equipment);
            int insert2 = equipmentDetalisMapper.insert(equipment.getEquipmentDetalis());
            return insert + insert1 + insert2 == 3;
        }
    }

    @Override
    public List<TableDepartment> chaAllDepartment() {
        List<TableDepartment> tableDepartments = departmentMapper.selectByExample(null);
        return tableDepartments;
    }

    @Override
    public List<TableEmployee> departmentOfEmployee(String did) {
        TableEmployeeExample employeeExample = new TableEmployeeExample();
        TableEmployeeExample.Criteria criteria = employeeExample.createCriteria();
        criteria.andDepartmentIdEqualTo(did);
        List<TableEmployee> tableEmployees = employeeMapper.selectByExample(employeeExample);
        return tableEmployees;
    }

    @Override
    public List<TableEmployee> chaCheckingperson() {
        TableEmployeeExample employeeExample = new TableEmployeeExample();
        TableEmployeeExample.Criteria criteria = employeeExample.createCriteria();
        criteria.andDepartmentIdEqualTo("108");
        List<TableEmployee> tableEmployees = employeeMapper.selectByExample(employeeExample);
        return tableEmployees;
    }

    @Override
    public List<TableStorage> chaStorage() {
        return tableStorageMapper.selectByExample(null);
    }

    @Override
    public List<TableEmployee> chaOperatorpersonAddBillsperson() {
        TableEmployeeExample employeeExample = new TableEmployeeExample();
        TableEmployeeExample.Criteria criteria = employeeExample.createCriteria();
        criteria.andDepartmentIdEqualTo("110");
        List<TableEmployee> tableEmployees = employeeMapper.selectByExample(employeeExample);
        return tableEmployees;

    }

    @Override
    public List<TableFurnish> chaFurnish() {
        return furnishMapper.selectByExample(null);
    }

    @Override
    public List<TableManufacturer> chaAllManufacturer() {
        return manufacturerMapper.selectByExample(null);
    }

    @Override
    public List<TableEquipmentType> chaEquipmentType() {
        return equipmentTypeMapper.selectByExample(null);
    }
}
