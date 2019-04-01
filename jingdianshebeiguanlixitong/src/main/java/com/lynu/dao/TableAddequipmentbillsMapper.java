package com.lynu.dao;

import com.lynu.bean.TableAddequipmentbills;
import com.lynu.bean.TableAddequipmentbillsExample;
import org.apache.ibatis.annotations.Param;

import javax.xml.crypto.Data;
import java.util.List;

public interface TableAddequipmentbillsMapper {
    long countByExample(TableAddequipmentbillsExample example);

    int deleteByExample(TableAddequipmentbillsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TableAddequipmentbills record);

    int insertSelective(TableAddequipmentbills record);

    List<TableAddequipmentbills> selectByExample(TableAddequipmentbillsExample example);

    TableAddequipmentbills selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TableAddequipmentbills record, @Param("example") TableAddequipmentbillsExample example);

    int updateByExample(@Param("record") TableAddequipmentbills record, @Param("example") TableAddequipmentbillsExample example);

    int updateByPrimaryKeySelective(TableAddequipmentbills record);

    int updateByPrimaryKey(TableAddequipmentbills record);

//    List<TableAddequipmentbills> selectData(Data startTiem, Data endTime);
}