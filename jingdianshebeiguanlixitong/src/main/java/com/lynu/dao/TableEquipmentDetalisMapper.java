package com.lynu.dao;

import com.lynu.bean.TableEquipmentDetalis;
import com.lynu.bean.TableEquipmentDetalisExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TableEquipmentDetalisMapper {
    long countByExample(TableEquipmentDetalisExample example);

    int deleteByExample(TableEquipmentDetalisExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TableEquipmentDetalis record);

    int insertSelective(TableEquipmentDetalis record);

    List<TableEquipmentDetalis> selectByExample(TableEquipmentDetalisExample example);

    TableEquipmentDetalis selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TableEquipmentDetalis record, @Param("example") TableEquipmentDetalisExample example);

    int updateByExample(@Param("record") TableEquipmentDetalis record, @Param("example") TableEquipmentDetalisExample example);

    int updateByPrimaryKeySelective(TableEquipmentDetalis record);

    int updateByPrimaryKey(TableEquipmentDetalis record);
}