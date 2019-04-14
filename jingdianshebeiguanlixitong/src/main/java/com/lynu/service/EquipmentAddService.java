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
   boolean   addEquipment(TableAddequipmentbills addequipmentbills, TableEquipment equipment, TableEquipmentDetalis equipmentDetalis);

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

    /**
     * 查询所有有效的增加订单
     * @return
     */
    List<TableAddequipmentbills> chaAddequipmentbills();

    /**
     * 查询所有的订单
     * @return
     */
    List<TableAddequipmentbills> chaAllAddequipmentbills();

    /**
     * 根据时间范围查询订单
     * @param startTime
     * @param endTime
     * @return
     */
    List<TableAddequipmentbills> chaDateAddEquipmentbills(String startTime, String endTime);


    /**
     * 根据设备增加订单id 删除增加订单
     * @param aid
     * @return
     */
    boolean delAddquipmentbills(String aid);

    /**
     * 删除全部的增加订单
     * @return
     */
    boolean delAllAddquipmentbills();

    /**
     * 根据id查询增加订单
     * @param aid
     * @return
     */
    TableAddequipmentbills chaKeyAddEquipment(String aid);


    /**
     * 添加订单数量
     * @return
     */
    Integer chaCount();


}
