package com.lynu.dao;

import java.util.List;
import java.util.Map;

public interface ExecuteMapper {
    /*设备故障登记*/
    public List<Map<String,Object>> deviceErrorList();
    public List<Map<String,Object>> deviceErrorQuery(Map<String,Object> queryData);
    public int deleteBatch(List<String> exceptIds);

    /*故障维修管理*/
    public List<Map<String,Object>> repairList();
    public List<Map<String,Object>> repairListQuery(Map<String,Object> queryData);
}
