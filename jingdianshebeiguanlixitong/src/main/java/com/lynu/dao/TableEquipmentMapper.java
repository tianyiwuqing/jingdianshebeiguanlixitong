package com.lynu.dao;

import com.lynu.bean.TableEquipment;
import com.lynu.bean.TableEquipmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TableEquipmentMapper {
    long countByExample(TableEquipmentExample example);

    int deleteByExample(TableEquipmentExample example);

    int deleteByPrimaryKey(String id);

    int insert(TableEquipment record);

    int insertSelective(TableEquipment record);

    List<TableEquipment> selectByExample(TableEquipmentExample example);

    TableEquipment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TableEquipment record, @Param("example") TableEquipmentExample example);

    int updateByExample(@Param("record") TableEquipment record, @Param("example") TableEquipmentExample example);

    int updateByPrimaryKeySelective(TableEquipment record);

    int updateByPrimaryKey(TableEquipment record);
}