package com.lynu.dao;

import com.lynu.bean.TableStorage;
import com.lynu.bean.TableStorageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TableStorageMapper {
    long countByExample(TableStorageExample example);

    int deleteByExample(TableStorageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TableStorage record);

    int insertSelective(TableStorage record);

    List<TableStorage> selectByExample(TableStorageExample example);

    TableStorage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TableStorage record, @Param("example") TableStorageExample example);

    int updateByExample(@Param("record") TableStorage record, @Param("example") TableStorageExample example);

    int updateByPrimaryKeySelective(TableStorage record);

    int updateByPrimaryKey(TableStorage record);
}