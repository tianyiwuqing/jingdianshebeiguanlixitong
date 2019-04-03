package com.lynu.dao;

import com.lynu.bean.TableRepertory;
import com.lynu.bean.TableRepertoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TableRepertoryMapper {
    long countByExample(TableRepertoryExample example);

    int deleteByExample(TableRepertoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TableRepertory record);

    int insertSelective(TableRepertory record);

    List<TableRepertory> selectByExample(TableRepertoryExample example);

    TableRepertory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TableRepertory record, @Param("example") TableRepertoryExample example);

    int updateByExample(@Param("record") TableRepertory record, @Param("example") TableRepertoryExample example);

    int updateByPrimaryKeySelective(TableRepertory record);

    int updateByPrimaryKey(TableRepertory record);
}