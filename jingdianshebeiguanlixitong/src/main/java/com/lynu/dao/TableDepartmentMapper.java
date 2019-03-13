package com.lynu.dao;

import com.lynu.bean.TableDepartment;
import com.lynu.bean.TableDepartmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TableDepartmentMapper {
    long countByExample(TableDepartmentExample example);

    int deleteByExample(TableDepartmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TableDepartment record);

    int insertSelective(TableDepartment record);

    List<TableDepartment> selectByExample(TableDepartmentExample example);

    TableDepartment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TableDepartment record, @Param("example") TableDepartmentExample example);

    int updateByExample(@Param("record") TableDepartment record, @Param("example") TableDepartmentExample example);

    int updateByPrimaryKeySelective(TableDepartment record);

    int updateByPrimaryKey(TableDepartment record);
}