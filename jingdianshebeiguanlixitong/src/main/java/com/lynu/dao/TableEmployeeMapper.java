package com.lynu.dao;

import com.lynu.bean.TableEmployee;
import com.lynu.bean.TableEmployeeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TableEmployeeMapper {
    long countByExample(TableEmployeeExample example);

    int deleteByExample(TableEmployeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TableEmployee record);

    int insertSelective(TableEmployee record);

    List<TableEmployee> selectByExample(TableEmployeeExample example);

    TableEmployee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TableEmployee record, @Param("example") TableEmployeeExample example);

    int updateByExample(@Param("record") TableEmployee record, @Param("example") TableEmployeeExample example);

    int updateByPrimaryKeySelective(TableEmployee record);

    int updateByPrimaryKey(TableEmployee record);
}