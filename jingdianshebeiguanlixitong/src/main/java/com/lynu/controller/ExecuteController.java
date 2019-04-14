package com.lynu.controller;

import com.lynu.service.ExecuteService;
import com.lynu.tools.DataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
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
        System.out.print("设备故障登记列表");
        List<Map<String,Object>> result = service.deviceErrorList();
        if(result != null && !result.isEmpty()){
            DataUtil.dbMap2Forward(result);
            return result;
        }
        return null;
    }

    /**
     * 设备故障登记列表批量删除
     * @param exceptIds
     * @return
     */
    @ResponseBody
    @RequestMapping("deviceErrorDelete")
    public Map<String,Object> deleteBatch(@RequestBody List exceptIds){
        System.out.print("设备故障登记列表批量删除:"+exceptIds.toString());
        Map<String,Object> result = new HashMap<>(16);
        if(exceptIds != null && !exceptIds.isEmpty()){
            if(service.deleteBatch(exceptIds)>0){
                result.put("result","OK");
                result.put("data", result);
                return result;
            }
        }

        result.put("result","FAIL");
        result.put("message","没有传入异常ID信息!");
        return result;
    }

    /**
     * 设备故障登记列表条件查询
     * @return
     */
    @RequestMapping("deviceErrorQuery")
    @ResponseBody
    public List<Map<String,Object>> deviceErrorQuery(@RequestBody Map<String,Object> queryData){
        System.out.print("设备故障登记列表条件查询："+ queryData.toString());
        if(queryData == null || queryData.isEmpty()){
            return null;
        }

        List<Map<String, Object>> result = service.deviceErrorQuery(queryData);
        return result == null || result.isEmpty() ? null : result;
    }

    /**
     * 故障维修管理列表
     * @return
     */
    @RequestMapping("repairList")
    @ResponseBody
    public List<Map<String,Object>> repairList(){
        System.out.print("故障维修管理列表");
        List<Map<String, Object>> result = service.repairList();
        if(result != null && !result.isEmpty()){
            DataUtil.dbMap2Forward(result);
            return result;
        }
        return null;
    }

    /**
     * 故障维修管理列表条件查询
     * @return
     */
    @ResponseBody
    @RequestMapping("repairListQuery")
    public List<Map<String,Object>> repairListQuery(@RequestBody Map<String,Object> queryData){
        System.out.print("故障维修管理列表条件查询："+queryData.toString());
        if(queryData == null || queryData.isEmpty()){
            return null;
        }

        List<Map<String,Object>> result = service.repairListQuery(queryData);
        if(result != null && !result.isEmpty()){
            DataUtil.dbMap2Forward(result);
            return result;
        }
        return null;
    }
}
