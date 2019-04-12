package com.lynu.dao;


import com.lynu.bean.TableScrap;
import com.lynu.bean.TableScrapExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TableScrapMapper {
    long countByExample(TableScrapExample example);

    int deleteByExample(TableScrapExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TableScrap record);

    int insertSelective(TableScrap record);

    List<TableScrap> selectByExample(TableScrapExample example);

    TableScrap selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TableScrap record, @Param("example") TableScrapExample example);

    int updateByExample(@Param("record") TableScrap record, @Param("example") TableScrapExample example);

    int updateByPrimaryKeySelective(TableScrap record);

    int updateByPrimaryKey(TableScrap record);
}