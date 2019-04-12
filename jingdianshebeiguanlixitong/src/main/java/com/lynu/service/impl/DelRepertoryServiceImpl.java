package com.lynu.service.impl;

import com.lynu.bean.*;
import com.lynu.dao.*;
import com.lynu.service.DelRepertoryService;
import com.lynu.tools.MathRandomUUID;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * @author 天意无情
 * @date 2019-04-06 18:08
 */
@Service
public class DelRepertoryServiceImpl implements DelRepertoryService {

    @Resource
    private TableRepertoryOutMapper repertoryOutMapper;

    @Resource
    private TableRepertoryMapper repertoryMapper;

    @Resource
    private TableStorageMapper storageMapper;

    @Resource
    private TableEquipmentMapper equipmentMapper;

    @Resource
    private TableEquipmentDetalisMapper equipmentDetalisMapper;

    @Resource
    private TableEmployeeMapper employeeMapper;

    @Resource
    private TableDepartmentMapper departmentMapper;


    @Override
    public List<TableRepertory> chaSource(String bmid,String sbfl) {
        List<TableRepertory> tableRepertories = chaRepertory(bmid, sbfl);
        if (tableRepertories==null&&tableRepertories.size()==0){
            return null;
        }
        int size = tableRepertories.size();
        for (int i=0;i<size;){
            TableRepertory repertory = tableRepertories.get(i);
            if (repertory.getState()==2){
                tableRepertories.remove(i);
                size--;
            }else {
                repertory.setStorage(storageMapper.selectByPrimaryKey(repertory.getAddressStongId()));
                repertory.setEquipment(equipmentMapper.selectByPrimaryKey(repertory.getEquipmentId().toString()));
                i++;
            }
        }
        return tableRepertories;
    }

    @Override
    public List<TableEmployee> chaOfKeyStong() {
        TableEmployeeExample employeeExample=new TableEmployeeExample();
        TableEmployeeExample.Criteria criteria = employeeExample.createCriteria();
        criteria.andDepartmentIdEqualTo("200");
        List<TableEmployee> tableEmployees = employeeMapper.selectByExample(employeeExample);
        return tableEmployees;
    }

    @Override
    public List<TableEmployee> chaAllEmployee() {
        return employeeMapper.selectByExample(null);
    }

    @Override
    public boolean addDelRerpertory(TableRepertoryOut repertoryOut) {
        repertoryOut.setId(Integer.parseInt(MathRandomUUID.UUidRandom(9)));
        repertoryOut.setUpdateTime(new Date());
        repertoryOut.setCreateTime(new Date());
        repertoryOut.setIsDelate(0);
        //设置厂库的设备
        TableRepertoryExample repertoryExample=new TableRepertoryExample();
        TableRepertoryExample.Criteria criteria = repertoryExample.createCriteria();
        criteria.andEquipmentuniquecodeEqualTo(repertoryOut.getEquipmentcode());
        List<TableRepertory> tableRepertories = repertoryMapper.selectByExample(repertoryExample);
        TableRepertory repertory = tableRepertories.get(0);
        repertory.setState(2);
        repertory.setUpdateTime(new Date());
        int i = repertoryMapper.updateByPrimaryKey(repertory);
        int insert = repertoryOutMapper.insert(repertoryOut);
        return i+insert>insert;
    }

    @Override
    public Integer chacount() {
        List<TableRepertoryOut> tableRepertoryOuts = repertoryOutMapper.selectByExample(null);
        int count=0;
        for (TableRepertoryOut tableRepertoryOut : tableRepertoryOuts) {
            if (tableRepertoryOut.getIsDelate()==0){
                count++;
            }
        }
        return count;
    }

    @Override
    public List<TableRepertoryOut> chaAllRepertoryOut() {
        List<TableRepertoryOut> tableRepertoryOuts = repertoryOutMapper.selectByExample(null);
        int size = tableRepertoryOuts.size();
        for (int i=0;i<size;){
            TableRepertoryOut tableRepertoryOut = tableRepertoryOuts.get(i);
            if (tableRepertoryOut.getIsDelate()==1){
                tableRepertoryOuts.remove(i);
                size--;
            }else {
                tableRepertoryOut.setReceiveDepartment(departmentMapper.selectByPrimaryKey(Integer.parseInt(tableRepertoryOut.getReceivedepartmentid())));
                tableRepertoryOut.setReceiveEmployee(employeeMapper.selectByPrimaryKey(Integer.parseInt(tableRepertoryOut.getReceiveemployeeid())));
                tableRepertoryOut.setCreateEmployee(employeeMapper.selectByPrimaryKey(Integer.parseInt(tableRepertoryOut.getCreateemployeeid())));
                i++;
            }
        }
        return tableRepertoryOuts;
    }

    @Override
    public boolean delAllDelRepertory() {
        int count=0;
        List<TableRepertoryOut> tableRepertoryOuts = repertoryOutMapper.selectByExample(null);
        for (TableRepertoryOut tableRepertoryOut : tableRepertoryOuts) {
            tableRepertoryOut.setIsDelate(1);
            int i = repertoryOutMapper.updateByPrimaryKey(tableRepertoryOut);
            count+=i;
        }
        return count>=tableRepertoryOuts.size();
    }

    @Override
    public boolean delKeyIdDelRepertory(String did) {
        TableRepertoryOut tableRepertoryOut = repertoryOutMapper.selectByPrimaryKey(Integer.parseInt(did));
        tableRepertoryOut.setIsDelate(1);
        return repertoryOutMapper.updateByPrimaryKey(tableRepertoryOut)>0;
    }

    public List<TableRepertory> chaRepertory(String bmid,String sbfl){
        TableRepertoryExample repertoryExample=new TableRepertoryExample();
        TableRepertoryExample.Criteria criteria = repertoryExample.createCriteria();
        criteria.andOwndepartmentEqualTo(Integer.parseInt(bmid));
        List<TableRepertory> tableRepertories = repertoryMapper.selectByExample(repertoryExample);
        if (tableRepertories==null&&tableRepertories.size()==0){
            return null;
        }
        if (sbfl.equals("0")){
            return tableRepertories;
        }
        int size = tableRepertories.size();
        for (int i=0;i<size;i++){
            TableEquipmentDetalisExample equipmentDetalisExample=new TableEquipmentDetalisExample();
            TableEquipmentDetalisExample.Criteria criteria1 = equipmentDetalisExample.createCriteria();
            criteria1.andEquipmentIdEqualTo(tableRepertories.get(i).getEquipmentId().toString());
            List<TableEquipmentDetalis> tableEquipmentDetalis = equipmentDetalisMapper.selectByExample(equipmentDetalisExample);
            if (!tableEquipmentDetalis.get(0).getEquipmentType().toString().equals(sbfl)){
                tableRepertories.remove(tableRepertories.get(i));
            }
        }
        return tableRepertories;
    }
}
