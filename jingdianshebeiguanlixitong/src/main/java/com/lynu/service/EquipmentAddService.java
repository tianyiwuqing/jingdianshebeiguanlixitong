package com.lynu.service;

import com.lynu.bean.*;

import java.util.List;

/**
 * @author 天意无情
 * @date 2019-03-13 8:42
 */
public interface EquipmentAddService {

    /**
     * 添加设备
     * @param addequipmentbills ,count
     * @return
     */
   boolean   addEquipment(TableAddequipmentbills addequipmentbills,String count);

    /**
     * 查询所有部门
     * @return
     */
   List<TableDepartment> chaAllDepartment();

    /**
     * 根据部门id查找员工
     * @param did
     * @return
     */
   List<TableEmployee> departmentOfEmployee(String did);


    /**
     * 查询验收人员
     * @return
     */
   List<TableEmployee> chaCheckingperson();

    /**
     * 查询仓库
     * @return
     */
   List<TableStorage> chaStorage();

    /**
     * 查询经办人员和登账人员
     * @return
     */
    List<TableEmployee> chaOperatorpersonAddBillsperson();

    /**
     * 查询生产厂商
     * @return
     */
    List<TableFurnish> chaFurnish();

    /**
     * 查询生产厂商
     * @return
     */
    List<TableManufacturer> chaAllManufacturer();

    /**
     * 查询设备分类
     * @return
     */
    List<TableEquipmentType> chaEquipmentType();
}
