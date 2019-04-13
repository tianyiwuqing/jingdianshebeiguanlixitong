package com.lynu.service;

import com.lynu.bean.TableEmployee;

import java.util.List;

/**
 * @author 天意无情
 * @date 2019-04-09 23:11
 */
public interface EmployeeService {

    /**
     * 查员工多少人
     * @return
     */
    Integer chaEmployeeCount();

    /**
     * 添加员工
     * @param employee
     * @return
     */
    boolean addEmployee(TableEmployee employee);


    /**
     * 查询所有的员工
     * @return
     */
    List<TableEmployee> chaAllEmployee();

    /**
     * 根据id删除员工
     * @return
     */
    boolean delEmployee(String eid);

    /**
     * 格局id修改启用权限
     * @param eid
     * @return
     */
    boolean uodateEmployee(String eid);

    /**
     * 根据id获取员工信息
     * @param eid
     * @return
     */
    TableEmployee chaEmployee(String eid);

}
