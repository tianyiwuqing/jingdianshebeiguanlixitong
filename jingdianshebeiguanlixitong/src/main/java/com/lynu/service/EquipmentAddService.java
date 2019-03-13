package com.lynu.service;

import com.lynu.bean.TableEquipment;

/**
 * @author 天意无情
 * @date 2019-03-13 8:42
 */
public interface EquipmentAddService {

    /**
     * 添加设备
     * @param equipment
     * @return
     */
   boolean   addEquipment(TableEquipment equipment);
}
