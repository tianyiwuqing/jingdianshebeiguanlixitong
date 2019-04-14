package com.lynu.service.impl;

import com.lynu.dao.ExecuteMapper;
import com.lynu.service.ExecuteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ExecuteServiceImpl implements ExecuteService {

    @Autowired
    private ExecuteMapper mapper;

    /*设备故障登记*/
    @Override
    public List<Map<String, Object>> deviceErrorList() {
        return mapper.deviceErrorList();
    }

    @Override
    public int deleteBatch(List exceptIds) {
        Map<String,List> data = new HashMap<>(16);
        data.put("exceptIds",exceptIds);
        return mapper.deleteBatch(data);
    }

    @Override
    public List<Map<String, Object>> deviceErrorQuery(Map<String,Object> queryData) {
        return mapper.deviceErrorQuery(queryData);
    }


    /*故障维修管理*/
    @Override
    public List<Map<String, Object>> repairList() {
        return mapper.repairList();
    }

    /**
     * 故障维修管理条件查询
     * @param queryData
     * @return
     */
    public List<Map<String,Object>> repairListQuery(Map<String,Object> queryData){
        return mapper.repairListQuery(queryData);
    }
}
