package com.lynu.service.impl;

import com.lynu.dao.ExecuteMapper;
import com.lynu.service.ExecuteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ExecuteServiceImpl implements ExecuteService {

    @Autowired
    private ExecuteMapper mapper;

    @Override
    public List<Map<String, Object>> deviceErrorList() {
        return mapper.deviceErrorList();
    }
}
