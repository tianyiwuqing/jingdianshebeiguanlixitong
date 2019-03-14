package com.lynu.dao;

import com.lynu.bean.TableDepreciation;
import com.lynu.bean.TableDepreciationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TableDepreciationMapper {
    long countByExample(TableDepreciationExample example);

    int deleteByExample(TableDepreciationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TableDepreciation record);

    int insertSelective(TableDepreciation record);

    List<TableDepreciation> selectByExample(TableDepreciationExample example);

    TableDepreciation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TableDepreciation record, @Param("example") TableDepreciationExample example);

    int updateByExample(@Param("record") TableDepreciation record, @Param("example") TableDepreciationExample example);

    int updateByPrimaryKeySelective(TableDepreciation record);

    int updateByPrimaryKey(TableDepreciation record);
}