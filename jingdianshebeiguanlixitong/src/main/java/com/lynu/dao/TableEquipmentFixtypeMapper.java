package com.lynu.dao;

import com.lynu.bean.TableEquipmentFixtype;
import com.lynu.bean.TableEquipmentFixtypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TableEquipmentFixtypeMapper {
    long countByExample(TableEquipmentFixtypeExample example);

    int deleteByExample(TableEquipmentFixtypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TableEquipmentFixtype record);

    int insertSelective(TableEquipmentFixtype record);

    List<TableEquipmentFixtype> selectByExample(TableEquipmentFixtypeExample example);

    TableEquipmentFixtype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TableEquipmentFixtype record, @Param("example") TableEquipmentFixtypeExample example);

    int updateByExample(@Param("record") TableEquipmentFixtype record, @Param("example") TableEquipmentFixtypeExample example);

    int updateByPrimaryKeySelective(TableEquipmentFixtype record);

    int updateByPrimaryKey(TableEquipmentFixtype record);
}