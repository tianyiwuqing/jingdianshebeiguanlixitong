package com.lynu.service;

import com.lynu.bean.TableDepartment;
import com.lynu.bean.TableEmployee;

import java.util.List;

/**
 * @author 天意无情
 * @date 2019-04-12 15:24
 */
public interface DepartmentService {

    /**
     * 查询所有的部门
     * @return
     */
    List<TableDepartment> chaAllDepartment();


    /**
     * 报废部门
     * @param did
     * @return
     */
    boolean delDepartment(String did);

    /**
     * 正常工作部门数量
     * @return
     */
    Integer departCount();

    /**
     * 查询所有员工
     * @return
     */
    List<TableEmployee> chaAllEmployee();

    /**
     * 增加部门
     * @return
     */
    boolean addDepartment(TableDepartment department);


    /**
     * 根据id查找部门
     * @param did
     * @return
     */
    TableDepartment chaOfKeyEquipment(String did);

    /**
     * 修改部门信息
     * @param department
     * @return
     */
    boolean editEquipment(TableDepartment department);



}
