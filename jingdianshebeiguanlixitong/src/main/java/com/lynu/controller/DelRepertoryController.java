package com.lynu.controller;

import com.lynu.bean.TableEmployee;
import com.lynu.bean.TableRepertory;
import com.lynu.bean.TableRepertoryOut;
import com.lynu.service.DelRepertoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 天意无情
 * @date 2019-04-06 21:47
 */
@Controller
@RequestMapping("delRepertoryController")
public class DelRepertoryController {

    @Resource
    private DelRepertoryService delRepertoryService;

    @RequestMapping("chaSource")
    @ResponseBody
    public List<TableRepertory> chaSource(String bmid,String sbfl){
        List<TableRepertory> tableRepertories = delRepertoryService.chaSource(bmid, sbfl);
        return tableRepertories;
    }


    @RequestMapping("chaOfKeyStong")
    @ResponseBody
    public List<TableEmployee> chaOfKeyStong(){
        return delRepertoryService.chaOfKeyStong();
    }

    @RequestMapping("chaAllEmployee")
    @ResponseBody
    public List<TableEmployee> chaAllEmployee() {
        return delRepertoryService.chaAllEmployee();
    }

    @RequestMapping("addDelRepertory")
    @ResponseBody
    public boolean addDelRepertory(TableRepertoryOut repertoryOut){
        return delRepertoryService.addDelRerpertory(repertoryOut);
    }

    @RequestMapping("chacount")
    @ResponseBody
    public Integer chacount(HttpSession session){
        int chacount = delRepertoryService.chacount();
        session.setAttribute("deRepertorycount",chacount);
        return chacount;
    }

    @RequestMapping("chaAllRepertoryOut")
    @ResponseBody
    public List<TableRepertoryOut> chaAllRepertoryOut(){
        List<TableRepertoryOut> tableRepertoryOuts = delRepertoryService.chaAllRepertoryOut();
        return tableRepertoryOuts;
    }

    @RequestMapping("delAllDelRepertory")
    @ResponseBody
    public boolean delAllDelRepertory(){
        return delRepertoryService.delAllDelRepertory();
    }

    @RequestMapping("delKeyIdDelRepertory")
    @ResponseBody
    public boolean delKeyIdDelRepertory(String did){
       return delRepertoryService.delKeyIdDelRepertory(did);
    }
}
