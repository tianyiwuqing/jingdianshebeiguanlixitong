package com.lynu.service.impl;

import com.lynu.bean.TableEquipment;
import com.lynu.dao.TableEquipmentMapper;
import com.lynu.service.EquipmentAddService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 天意无情
 * @date 2019-03-13 8:43
 */
@Service
public class EquipmentAddServiceImpl implements EquipmentAddService {

    @Resource
    private TableEquipmentMapper equipmentMapper;


    @Override
    public boolean addEquipment(TableEquipment equipment) {
        return equipmentMapper.insert(equipment)>0;
    }
}
