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

    @Override
    public List<TableRepertory> chaAllRepertory() {
        List<TableRepertory> tableRepertories = repertoryMapper.selectByExample(null);
        for (TableRepertory tableRepertory : tableRepertories) {
            TableEquipment tableEquipment = equipmentMapper.selectByPrimaryKey(tableRepertory.getEquipmentId().toString());
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
            tableRepertory.setFurnish(furnishMapper.selectByPrimaryKey(tableRepertory.getFunctionary()));
            tableRepertory.setEquipment(tableEquipment);
            tableRepertory.setDepartment(departmentMapper.selectByPrimaryKey(tableRepertory.getOwndepartment()));
        }
        return tableRepertories;
    }


    /**
     * 入库
     * @param aid
     * @return
     */
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
        int i = addequipmentbillsMapper.deleteByPrimaryKey(addequipmentbills.getId());
        int countNum=0;
        for (int n=0;n<addequipmentbills.getCount();n++){
            repertory.setId(Integer.parseInt(MathRandomUUID.UUidRandom(9)));
            repertory.setEquipmentuniquecode(MathRandomUUID.myUUid());
            int i1 = repertoryMapper.insert(repertory);
            countNum+=i1;
        }
        System.out.println(i+":deleter   insert:"+countNum);
        return i+countNum>addequipmentbills.getCount();
    }
}
