package com.lynu.service.impl;

import com.lynu.bean.*;
import com.lynu.dao.*;
import com.lynu.service.EquipmentAddService;
import com.lynu.tools.MathRandomUUID;
import com.lynu.tools.MyDateFormat;
import org.springframework.stereotype.Service;

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
    public boolean addEquipment(TableAddequipmentbills addequipmentbills, TableEquipment equipment, TableEquipmentDetalis equipmentDetalis) {
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
        if (tableEquipments.size() > 0) {
            //获取设备id
            addequipmentbills.setEquipmentId(Integer.parseInt(tableEquipments.get(0).getId()));
            return addequipmentbillsMapper.insert(addequipmentbills) > 0;
        } else {
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
        int size = tableAddequipmentbills.size();
        for (int i = 0; i < size; ) {
            TableAddequipmentbills addequipmentbills = tableAddequipmentbills.get(i);
            if (addequipmentbills.getIsDelate() == 1) {
                tableAddequipmentbills.remove(i);
                size--;
            } else {
                //通过id查询对象
                TableEmployee tableEmployee = employeeMapper.selectByPrimaryKey(Integer.parseInt(addequipmentbills.getBillsperson()));
                TableFurnish tableFurnish = furnishMapper.selectByPrimaryKey(Integer.parseInt(addequipmentbills.getEquipmentFurnish()));
                // 把查询对象插入增加订单中
                addequipmentbills.setFurnish(tableFurnish);
                addequipmentbills.setBillsEmployee(tableEmployee);
                addequipmentbills.setEquipment(equipmentMapper.selectByPrimaryKey(addequipmentbills.getEquipmentId().toString()));
                i++;
            }
        }
        return tableAddequipmentbills;
    }

    @Override
    public List<TableAddequipmentbills> chaAllAddequipmentbills() {
        List<TableAddequipmentbills> tableAddequipmentbills = addequipmentbillsMapper.selectByExample(null);
        for (TableAddequipmentbills tableAddequipmentbill : tableAddequipmentbills) {
            //通过id查询对象
            TableEmployee tableEmployee = employeeMapper.selectByPrimaryKey(Integer.parseInt(tableAddequipmentbill.getBillsperson()));
            TableFurnish tableFurnish = furnishMapper.selectByPrimaryKey(Integer.parseInt(tableAddequipmentbill.getEquipmentFurnish()));
            // 把查询对象插入增加订单中
            tableAddequipmentbill.setFurnish(tableFurnish);
            tableAddequipmentbill.setBillsEmployee(tableEmployee);
            tableAddequipmentbill.setEquipment(equipmentMapper.selectByPrimaryKey(tableAddequipmentbill.getEquipmentId().toString()));
        }
        return tableAddequipmentbills;
    }

    @Override
    public List<TableAddequipmentbills> chaDateAddEquipmentbills(String startTime, String endTime) {
        TableAddequipmentbillsExample example = new TableAddequipmentbillsExample();
        TableAddequipmentbillsExample.Criteria criteria = example.createCriteria();
        criteria.andCreateTimeBetween(MyDateFormat.dateFormat(startTime), MyDateFormat.dateFormat(endTime));
        return addequipmentbillsMapper.selectByExample(example);
    }

    @Override
    public boolean delAddquipmentbills(String aid) {
        return addequipmentbillsMapper.deleteByPrimaryKey(Integer.parseInt(aid)) > 0;
    }

    @Override
    public boolean delAllAddquipmentbills() {
        return addequipmentbillsMapper.deleteByExample(null) > 0;
    }

    @Override
    public TableAddequipmentbills chaKeyAddEquipment(String aid) {
        TableAddequipmentbills addequipmentbills = addequipmentbillsMapper.selectByPrimaryKey(Integer.parseInt(aid));
        addequipmentbills.setBillsEmployee(employeeMapper.selectByPrimaryKey(Integer.parseInt(addequipmentbills.getBillsperson())));
        addequipmentbills.setFurnish(furnishMapper.selectByPrimaryKey(Integer.parseInt(addequipmentbills.getEquipmentFurnish())));
        TableEquipment tableEquipment = equipmentMapper.selectByPrimaryKey(Integer.toString(addequipmentbills.getEquipmentId()));
        TableEquipmentDetalisExample equipmentDetalisExample = new TableEquipmentDetalisExample();
        TableEquipmentDetalisExample.Criteria criteria = equipmentDetalisExample.createCriteria();
        criteria.andEquipmentIdEqualTo(tableEquipment.getId());
        List<TableEquipmentDetalis> tableEquipmentDetaliss = equipmentDetalisMapper.selectByExample(equipmentDetalisExample);
        TableEquipmentDetalis tableEquipmentDetalis = tableEquipmentDetaliss.get(0);
        //获取equipmentdetails 并加入到equipment类中
        tableEquipment.setEquipmentDetalis(tableEquipmentDetalis);
        //将对象设备到订单类中
        addequipmentbills.setEquipment(tableEquipment);
        addequipmentbills.setDepartment(departmentMapper.selectByPrimaryKey(Integer.parseInt(addequipmentbills.getDepartmentId())));
        addequipmentbills.setCheckingpersonEmployee(employeeMapper.selectByPrimaryKey(Integer.parseInt(addequipmentbills.getCheckingperson())));
        addequipmentbills.setOperatorpersonEmployee(employeeMapper.selectByPrimaryKey(Integer.parseInt(addequipmentbills.getOperatorperson())));
        addequipmentbills.setReceptionEmployee(employeeMapper.selectByPrimaryKey(Integer.parseInt(addequipmentbills.getReceptionperson())));
        addequipmentbills.setShopdepartment(departmentMapper.selectByPrimaryKey(Integer.parseInt(addequipmentbills.getDepartmentId())));
        addequipmentbills.setStorage(tableStorageMapper.selectByPrimaryKey(Integer.parseInt(addequipmentbills.getAddress())));
        addequipmentbills.setTableManufacturer(manufacturerMapper.selectByPrimaryKey(Integer.parseInt(addequipmentbills.getEquipmentFurnish())));
        return addequipmentbills;
    }

    @Override
    public Integer chaCount() {
        Integer l = (int) addequipmentbillsMapper.countByExample(null);
        return l;
    }
}
