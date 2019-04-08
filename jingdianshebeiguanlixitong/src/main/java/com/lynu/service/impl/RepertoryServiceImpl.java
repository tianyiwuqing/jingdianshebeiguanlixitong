package com.lynu.service.impl;
import java.util.Date;

import com.lynu.bean.*;
import com.lynu.dao.*;
import com.lynu.service.RepertoryService;
import com.lynu.tools.MathRandomUUID;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 天意无情
 * @date 2019-04-03 11:07
 */

@Service
public class RepertoryServiceImpl implements RepertoryService {


    @Resource
    private TableRepertoryMapper repertoryMapper;

    @Resource
    private TableAddequipmentbillsMapper addequipmentbillsMapper;

    @Resource
    private TableEquipmentMapper equipmentMapper;

    @Resource
    private TableEquipmentDetalisMapper equipmentDetalisMapper;

    @Resource
    private TableFurnishMapper furnishMapper;

    @Resource
    private TableManufacturerMapper manufacturerMapper;

    @Resource
    private TableDepartmentMapper departmentMapper;

    @Resource
    private TableEmployeeMapper employeeMapper;

    @Resource
    private TableStorageMapper storageMapper;

    @Override
    public List<TableRepertory> chaAllRepertory() {
        List<TableRepertory> tableRepertories = repertoryMapper.selectByExample(null);
        int size = tableRepertories.size();
        for (int i=0;i<size;){
            TableRepertory repertory = tableRepertories.get(i);
            if (repertory.getState()==2||repertory.getIsDeleter()==1){
                tableRepertories.remove(i);
                size--;
            }else {
                TableEquipment tableEquipment = equipmentMapper.selectByPrimaryKey(repertory.getEquipmentId().toString());
                //获取equipmentdetils
                TableEquipmentDetalisExample equipmentDetalisExample=new TableEquipmentDetalisExample();
                TableEquipmentDetalisExample.Criteria criteria = equipmentDetalisExample.createCriteria();
                criteria.andEquipmentIdEqualTo(tableEquipment.getId());
                List<TableEquipmentDetalis> tableEquipmentDetalis = equipmentDetalisMapper.selectByExample(equipmentDetalisExample);
                TableEquipmentDetalis tableEquipmentDetalis1 = tableEquipmentDetalis.get(0);
                //设置equipmentDalis的属性
                tableEquipmentDetalis1.setTableManufacturer(manufacturerMapper.selectByPrimaryKey(tableEquipmentDetalis1.getManufacturer()));
                //设置equipment的属性
                tableEquipment.setEquipmentDetalis(tableEquipmentDetalis1);
                //设置入库表属性
                //供应商
                repertory.setFurnish(furnishMapper.selectByPrimaryKey(repertory.getFunctionary()));
                repertory.setEquipment(tableEquipment);
                TableDepartment tableDepartment = departmentMapper.selectByPrimaryKey(repertory.getOwndepartment());
                //设置所属部门
                repertory.setDepartment(tableDepartment);
                //设置责任人
                repertory.setFunctionaryEmployee(employeeMapper.selectByPrimaryKey(repertory.getFunctionary()));
                //设置设备仓库位置
                repertory.setStorage(storageMapper.selectByPrimaryKey(repertory.getAddressStongId()));
                i++;
            }
        }
        for (TableRepertory tableRepertory : tableRepertories) {


        }
        return tableRepertories;

    }

    @Override
    public boolean addRepertory(String aid) {
        TableAddequipmentbills addequipmentbills = addequipmentbillsMapper.selectByPrimaryKey(Integer.parseInt(aid));
        TableRepertory repertory=new TableRepertory();
        //设置仓库属性
        repertory.setEquipmentId(addequipmentbills.getEquipmentId());
        repertory.setAddressStongId(Integer.parseInt(addequipmentbills.getAddress()));
        repertory.setCreateIntime(new Date());
        repertory.setCreateOuttime(null);
        repertory.setShopTime(addequipmentbills.getPurchaseTime());
        repertory.setUpdateTime(new Date());
        repertory.setDepartmentOutId(0);
        repertory.setEmployeeOutId(0);
        repertory.setTelephone("");
        repertory.setState(0);
        repertory.setOwndepartment(Integer.parseInt(addequipmentbills.getShopdepartmentId()));
        repertory.setFunctionary(Integer.parseInt(addequipmentbills.getEquipmentFurnish()));
        repertory.setIsDeleter(0);
        addequipmentbills.setIsDelate(1);
        int i = addequipmentbillsMapper.updateByPrimaryKey(addequipmentbills);
        int countNum=0;
        for (int n=0;n<addequipmentbills.getCount();n++){
            repertory.setId(Integer.parseInt(MathRandomUUID.UUidRandom(9)));
            repertory.setEquipmentuniquecode(MathRandomUUID.myUUid());
            int i1 = repertoryMapper.insert(repertory);
            countNum+=i1;
        }
        return countNum+i>countNum;
    }

    @Override
    public boolean delAllRepertory() {
        return repertoryMapper.deleteByExample(null)>0;
    }

    @Override
    public boolean delRepertory(String rid) {
        return repertoryMapper.deleteByPrimaryKey(Integer.parseInt(rid))>0;
    }

    @Override
    public Integer chaCount() {
        List<TableRepertory> tableRepertories = repertoryMapper.selectByExample(null);
        int count=0;
        for (TableRepertory tableRepertory : tableRepertories) {
            if (tableRepertory.getState()==0){
                count++;
            }
        }
        return count;
    }
}
