package com.lynu.controller;

import com.lynu.service.ExecuteService;
import com.lynu.tools.DataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 运行管理
 */
@Controller
@RequestMapping("execute")
public class ExecuteController {

    @Autowired
    private ExecuteService service;

    /**
     * 设备故障登记列表
     * @return
     */
    @RequestMapping("deviceErrorList")
    @ResponseBody
    public List<Map<String,Object>> deviceErrorList(){
        List<Map<String,Object>> result = service.deviceErrorList();
        if(result != null && !result.isEmpty()){
            DataUtil.dbMap2Forward(result);
            return result;
        }
        return null;
    }
}
