package com.lynu.service;

import com.lynu.bean.TableEmployee;
import com.lynu.bean.TableRepertory;
import com.lynu.bean.TableRepertoryOut;

import java.util.List;

/**
 * @author 天意无情
 * @date 2019-04-06 18:07
 */
public interface DelRepertoryService {


    /**
     * 根据设备分类和部门id查询设备
     * @param bmid
     * @param sbfl
     * @return
     */
    List<TableRepertory> chaSource(String bmid,String sbfl);

    /**
     *查找设备科的工作人员
     * @return
     */
    List<TableEmployee> chaOfKeyStong();

    /**
     * 查询所有的员工
     * @return
     */
    List<TableEmployee> chaAllEmployee();

    /**
     * 添加出库订单
     * @param repertoryOut
     * @return
     */
    boolean addDelRerpertory(TableRepertoryOut repertoryOut);

    /**
     * 查询订单数量
     * @return
     */
    Integer chacount();

    /**
     * 查询所有的出库单
     * @return
     */
    List<TableRepertoryOut> chaAllRepertoryOut();

    /**
     * 批量删除
     * @return
     */
    boolean delAllDelRepertory();

    /**
     * 根据id删除订单
     * @return
     */
    boolean delKeyIdDelRepertory(String did);

}
