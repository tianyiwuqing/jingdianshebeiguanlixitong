package com.lynu.service;

import java.util.List;
import java.util.Map;

public interface ExecuteService {
    /*设备故障登记*/
    public List<Map<String,Object>> deviceErrorList();
    public int deleteBatch(List<String> exceptIds);
    public List<Map<String,Object>> deviceErrorQuery(Map<String,Object> queryData);

    /*故障维修管理*/
    public List<Map<String,Object>> repairList();
    public List<Map<String,Object>> repairListQuery(Map<String,Object> queryData);
}
