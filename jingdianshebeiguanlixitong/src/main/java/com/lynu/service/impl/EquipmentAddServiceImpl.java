package com.lynu.service.impl;

import com.lynu.bean.*;
import com.lynu.dao.*;
import com.lynu.service.EquipmentAddService;
import com.lynu.tools.MathRandomUUID;
import com.lynu.tools.MyDateFormat;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.UUID;

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
    public boolean addEquipment(TableAddequipmentbills addequipmentbills, TableEquipment equipment, TableEquipmentDetalis equipmentDetalis) {
        System.out.println("serviceimpl yunxing");
        addequipmentbills.setCreateTime(MyDateFormat.StringFormat(new Date()));
        addequipmentbills.setIsDelate(0);
        addequipmentbills.setUpdateTime(new Date());
        //设置生成增加订单id
        addequipmentbills.setId(Integer.parseInt(MathRandomUUID.UUidRandom(9)));
        TableEquipmentExample equipmentExample = new TableEquipmentExample();
        TableEquipmentExample.Criteria criteria = equipmentExample.createCriteria();
        criteria.andEquipmentNameEqualTo(equipment.getEquipmentName());
        criteria.andEquipmentStandardEqualTo(equipment.getEquipmentStandard());
        List<TableEquipment> tableEquipments = equipmentMapper.selectByExample(equipmentExample);
        System.out.println(tableEquipments.size() + "   :tableEquipments.size()");
        if (tableEquipments.size() > 0) {
            //获取设备id
            addequipmentbills.setEquipmentId(Integer.parseInt(tableEquipments.get(0).getId()));
            return addequipmentbillsMapper.insert(addequipmentbills) > 0;
        } else {
//            equipmentDetalis.setCreateTime(new Date());
            equipmentDetalis.setUpdateTime(new Date());
            //生成并设置设备id
            equipment.setId(MathRandomUUID.UUidRandom(9));
            //插入设备
            int insert = equipmentMapper.insert(equipment);
            //设备详情关联设备id
            equipmentDetalis.setEquipmentId(equipment.getId());
            //生成并设置设备详情id
            equipmentDetalis.setId(Integer.parseInt(MathRandomUUID.UUidRandom(9)));
            //插入设备详情
            int insert1 = equipmentDetalisMapper.insert(equipmentDetalis);
            //添加订单和设备进行id关联
            addequipmentbills.setEquipmentId(Integer.parseInt(equipment.getId()));
            //插入增加订单
            int insert2 = addequipmentbillsMapper.insert(addequipmentbills);
            System.out.println("end!");
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

    @Override
    public List<TableAddequipmentbills> chaAddequipmentbills() {
        List<TableAddequipmentbills> tableAddequipmentbills = addequipmentbillsMapper.selectByExample(null);
        for (TableAddequipmentbills tableAddequipmentbill : tableAddequipmentbills) {
                //            通过id查询对象
                TableEmployee tableEmployee = employeeMapper.selectByPrimaryKey(Integer.parseInt(tableAddequipmentbill.getBillsperson()));
                TableFurnish tableFurnish = furnishMapper.selectByPrimaryKey(Integer.parseInt(tableAddequipmentbill.getEquipmentFurnish()));
//            把查询对象插入增加订单中
                tableAddequipmentbill.setFurnish(tableFurnish);
                tableAddequipmentbill.setBillsEmployee(tableEmployee);
        }
        return tableAddequipmentbills;
    }

    @Override
    public boolean delAddquipmentbills(String aid) {
        return addequipmentbillsMapper.deleteByPrimaryKey(Integer.parseInt(aid))>0;
    }
}
