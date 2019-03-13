package com.lynu.dao;

import com.lynu.bean.TableFurnish;
import com.lynu.bean.TableFurnishExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TableFurnishMapper {
    long countByExample(TableFurnishExample example);

    int deleteByExample(TableFurnishExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TableFurnish record);

    int insertSelective(TableFurnish record);

    List<TableFurnish> selectByExample(TableFurnishExample example);

    TableFurnish selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TableFurnish record, @Param("example") TableFurnishExample example);

    int updateByExample(@Param("record") TableFurnish record, @Param("example") TableFurnishExample example);

    int updateByPrimaryKeySelective(TableFurnish record);

    int updateByPrimaryKey(TableFurnish record);
}