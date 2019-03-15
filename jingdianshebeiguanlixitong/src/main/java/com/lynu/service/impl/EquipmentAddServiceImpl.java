package com.lynu.service.impl;

import com.lynu.bean.TableDepartment;
import com.lynu.bean.TableEquipment;
import com.lynu.dao.TableDepartmentMapper;
import com.lynu.dao.TableEquipmentMapper;
import com.lynu.service.EquipmentAddService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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


    @Override
    public boolean addEquipment(TableEquipment equipment) {
        return equipmentMapper.insert(equipment)>0;
    }

    @Override
    public List<TableDepartment> chaAllDepartment() {
        List<TableDepartment> tableDepartments = departmentMapper.selectByExample(null);
        for (TableDepartment tableDepartment : tableDepartments) {
            System.out.println(tableDepartment);
        }
        return null;
    }
}
