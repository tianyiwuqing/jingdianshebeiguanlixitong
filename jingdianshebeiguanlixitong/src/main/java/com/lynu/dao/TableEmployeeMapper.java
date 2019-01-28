package com.lynu.dao;

import com.lynu.bean.TableEmployee;

public interface TableEmployeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TableEmployee record);

    int insertSelective(TableEmployee record);

    TableEmployee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TableEmployee record);

    int updateByPrimaryKey(TableEmployee record);
}