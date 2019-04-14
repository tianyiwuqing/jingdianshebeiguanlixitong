package com.lynu.service.impl;


import com.lynu.bean.*;
import com.lynu.dao.*;
import com.lynu.service.SrcapService;
import com.lynu.tools.MathRandomUUID;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author 天意无情
 * @date 2019-04-11 17:22
 */
@Service
public class srcapServiceImpl implements SrcapService {

    @Resource
    private TableRepertoryMapper repertoryMapper;

    @Resource
    private TableEquipmentMapper equipmentMapper;

    @Resource
    private TableEquipmentDetalisMapper equipmentDetalisMapper;

    @Resource
    private TableFurnishMapper furnishMapper;

    @Resource
    private TableManufacturerMapper manufacturerMapper;

    @Resource
    private TableEmployeeMapper employeeMapper;

    @Resource
    private TableStorageMapper storageMapper;

    @Resource
    private TableDepartmentMapper departmentMapper;

    @Resource
    private TableScrapMapper scrapMapper;


    @Override
    public List<TableRepertory> chaSoure(String bmid, String sbfl) {
        List<TableRepertory> tableRepertories = null;
        tableRepertories = chaRepertory(bmid, sbfl);
        if (tableRepertories == null && tableRepertories.size() == 0) {
            return null;
        }
        int size = tableRepertories.size();
        for (int i = 0; i < size; ) {
            TableRepertory repertory = tableRepertories.get(i);
            if (repertory.getState() == 2 || repertory.getIsDeleter() == 1) {
                tableRepertories.remove(i);
                size--;
            } else {
                if (repertory.getState() == 2) {
                    repertory.setStartstr("借出");
                } else if (repertory.getState() == 0) {
                    repertory.setStartstr("在库");
                }
                repertory.setStorage(storageMapper.selectByPrimaryKey(repertory.getAddressStongId()));
                repertory.setEquipment(equipmentMapper.selectByPrimaryKey(repertory.getEquipmentId().toString()));
                i++;
            }
        }
        return tableRepertories;
    }

    @Override
    public boolean addScrapbills(TableScrap scrap) {
        scrap.setId(Integer.parseInt(MathRandomUUID.UUidRandom(9)));
        scrap.setUpdateTime(new Date());
        scrap.setIsDelate(0);
        TableRepertoryExample repertoryExample = new TableRepertoryExample();
        TableRepertoryExample.Criteria criteria = repertoryExample.createCriteria();
        criteria.andEquipmentuniquecodeEqualTo(scrap.getEquipmentcode());
        List<TableRepertory> tableRepertories = repertoryMapper.selectByExample(repertoryExample);
        int i = 0;
        TableRepertory repertory = null;
        if (tableRepertories.get(0) != null) {
            repertory = tableRepertories.get(0);
            repertory.setIsDeleter(1);
            repertory.setUpdateTime(new Date());
            i = repertoryMapper.updateByPrimaryKey(repertory);
        }
        int insert = scrapMapper.insert(scrap);
        return insert + i > i;
    }

    @Override
    public List<TableEmployee> chaOfKeyEmployee() {
        TableEmployeeExample employeeExample = new TableEmployeeExample();
        TableEmployeeExample.Criteria criteria = employeeExample.createCriteria();
        criteria.andDepartmentIdEqualTo("865246330");
        return employeeMapper.selectByExample(employeeExample);
    }

    @Override
    public List<TableScrap> chaAllScrap() {
        List<TableScrap> tableScraps = scrapMapper.selectByExample(null);
        int size1 = tableScraps.size();
        for (int i = 0; i < size1; i++) {
            TableScrap tableScrap = tableScraps.get(i);
            tableScrap.setDepartment(departmentMapper.selectByPrimaryKey(Integer.parseInt(tableScrap.getDepartmentId())));
            tableScrap.setEquipment(equipmentMapper.selectByPrimaryKey(tableScrap.getEquipmentid()));
            tableScrap.setAuditorEmployee(employeeMapper.selectByPrimaryKey(Integer.parseInt(tableScrap.getAuditor())));
            tableScrap.setResponsibleEmployee(employeeMapper.selectByPrimaryKey(Integer.parseInt(tableScrap.getResponsible())));
            tableScrap.setCreateEmployee(employeeMapper.selectByPrimaryKey(Integer.parseInt(tableScrap.getCreatebillsemployeeid())));
            Integer isDelate = tableScrap.getIsDelate();
            if (isDelate == 0) {
                tableScrap.setIsDelateStr("正常");
            } else if (isDelate == 2) {
                tableScrap.setIsDelateStr("订单完成");
            } else {
                tableScrap.setIsDelateStr("删除");
            }
        }
        return tableScraps;
    }


    @Override
    public boolean delKeyScrapbills(String sid) {
        TableScrap tableScrap = scrapMapper.selectByPrimaryKey(Integer.parseInt(sid));
        tableScrap.setIsDelate(1);
        tableScrap.setUpdateTime(new Date());
        TableRepertoryExample repertoryExample = new TableRepertoryExample();
        TableRepertoryExample.Criteria criteria = repertoryExample.createCriteria();
        criteria.andEquipmentuniquecodeEqualTo(tableScrap.getEquipmentcode());
        List<TableRepertory> tableRepertories = repertoryMapper.selectByExample(repertoryExample);
        int i = 0;
        TableRepertory repertory = null;
        if (tableRepertories.get(0) != null) {
            repertory = tableRepertories.get(0);
            repertory.setIsDeleter(0);
            repertory.setUpdateTime(new Date());
            i = repertoryMapper.updateByPrimaryKey(repertory);
        }
        int insert = scrapMapper.updateByPrimaryKey(tableScrap);
        return insert + i > i;

    }

    @Override
    public Integer scrapCount() {
        int l = (int) scrapMapper.countByExample(null);
        return l;
    }

    @Override
    public List<TableRepertory> chaOfDeleterScrap() {
        List<TableRepertory> tableRepertories = null;
        TableRepertoryExample example = new TableRepertoryExample();
        TableRepertoryExample.Criteria criteria = example.createCriteria();
        criteria.andIsDeleterEqualTo(1);
        tableRepertories = repertoryMapper.selectByExample(example);
        for (TableRepertory tableRepertory : tableRepertories) {
            tableRepertory.setEquipment(equipmentMapper.selectByPrimaryKey(tableRepertory.getEquipmentId().toString()));
            if (tableRepertory.getIsDeleter() == 0) {
                tableRepertory.setIsDeleterStr("正常");
            } else if (tableRepertory.getIsDeleter() == 1) {
                tableRepertory.setIsDeleterStr("报废");
            }
        }
        return tableRepertories;
    }

    @Override
    public boolean delOutRepertory(String rid) {
        int i = 0;

        TableRepertory repertory = repertoryMapper.selectByPrimaryKey(Integer.parseInt(rid));
        TableScrapExample example = new TableScrapExample();
        TableScrapExample.Criteria criteria = example.createCriteria();
        criteria.andEquipmentcodeEqualTo(repertory.getEquipmentuniquecode());
        List<TableScrap> tableScraps = scrapMapper.selectByExample(example);
        if (tableScraps.get(0) != null) {
            TableScrap tableScrap = tableScraps.get(0);
            tableScrap.setIsDelate(2);
            tableScrap.setUpdateTime(new Date());
            i = scrapMapper.updateByPrimaryKey(tableScrap);
        }
        int i1 = repertoryMapper.deleteByPrimaryKey(Integer.parseInt(rid));
        return i+i1 > i;
    }


    //静态方法
    public List<TableRepertory> chaRepertory(String bmid, String sbfl) {
        TableRepertoryExample repertoryExample = null;
        repertoryExample = new TableRepertoryExample();
        TableRepertoryExample.Criteria criteria = repertoryExample.createCriteria();
        criteria.andOwndepartmentEqualTo(Integer.parseInt(bmid));
        List<TableRepertory> tableRepertories = null;
        tableRepertories = repertoryMapper.selectByExample(repertoryExample);
        if (tableRepertories == null && tableRepertories.size() == 0) {
            return null;
        }
        if (sbfl.equals("0")) {
            return tableRepertories;
        }
        int size = tableRepertories.size();
        for (int i = 0; i < size; i++) {
            TableEquipmentDetalisExample equipmentDetalisExample = null;
            equipmentDetalisExample = new TableEquipmentDetalisExample();
            TableEquipmentDetalisExample.Criteria criteria1 = equipmentDetalisExample.createCriteria();
            criteria1.andEquipmentIdEqualTo(tableRepertories.get(i).getEquipmentId().toString());
            List<TableEquipmentDetalis> tableEquipmentDetalis = equipmentDetalisMapper.selectByExample(equipmentDetalisExample);
            if (!tableEquipmentDetalis.get(0).getEquipmentType().toString().equals(sbfl)) {
                tableRepertories.remove(tableRepertories.get(i));
            }
        }
        return tableRepertories;
    }
}
