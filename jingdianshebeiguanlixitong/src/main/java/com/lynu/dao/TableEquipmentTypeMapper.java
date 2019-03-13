package com.lynu.dao;

import com.lynu.bean.TableEquipmentType;
import com.lynu.bean.TableEquipmentTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TableEquipmentTypeMapper {
    long countByExample(TableEquipmentTypeExample example);

    int deleteByExample(TableEquipmentTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TableEquipmentType record);

    int insertSelective(TableEquipmentType record);

    List<TableEquipmentType> selectByExample(TableEquipmentTypeExample example);

    TableEquipmentType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TableEquipmentType record, @Param("example") TableEquipmentTypeExample example);

    int updateByExample(@Param("record") TableEquipmentType record, @Param("example") TableEquipmentTypeExample example);

    int updateByPrimaryKeySelective(TableEquipmentType record);

    int updateByPrimaryKey(TableEquipmentType record);
}