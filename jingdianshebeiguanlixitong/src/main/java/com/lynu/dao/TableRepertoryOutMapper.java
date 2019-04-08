package com.lynu.dao;

import com.lynu.bean.TableRepertoryOut;
import com.lynu.bean.TableRepertoryOutExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TableRepertoryOutMapper {
    long countByExample(TableRepertoryOutExample example);

    int deleteByExample(TableRepertoryOutExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TableRepertoryOut record);

    int insertSelective(TableRepertoryOut record);

    List<TableRepertoryOut> selectByExample(TableRepertoryOutExample example);

    TableRepertoryOut selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TableRepertoryOut record, @Param("example") TableRepertoryOutExample example);

    int updateByExample(@Param("record") TableRepertoryOut record, @Param("example") TableRepertoryOutExample example);

    int updateByPrimaryKeySelective(TableRepertoryOut record);

    int updateByPrimaryKey(TableRepertoryOut record);
}