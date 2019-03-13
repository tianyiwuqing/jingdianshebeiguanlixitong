package com.lynu.dao;

import com.lynu.bean.TableManufacturer;
import com.lynu.bean.TableManufacturerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TableManufacturerMapper {
    long countByExample(TableManufacturerExample example);

    int deleteByExample(TableManufacturerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TableManufacturer record);

    int insertSelective(TableManufacturer record);

    List<TableManufacturer> selectByExample(TableManufacturerExample example);

    TableManufacturer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TableManufacturer record, @Param("example") TableManufacturerExample example);

    int updateByExample(@Param("record") TableManufacturer record, @Param("example") TableManufacturerExample example);

    int updateByPrimaryKeySelective(TableManufacturer record);

    int updateByPrimaryKey(TableManufacturer record);
}