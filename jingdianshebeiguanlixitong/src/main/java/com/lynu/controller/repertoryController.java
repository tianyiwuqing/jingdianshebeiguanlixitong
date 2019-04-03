package com.lynu.controller;

import com.lynu.bean.TableRepertory;
import com.lynu.service.RepertoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 天意无情
 * @date 2019-04-03 10:46
 */

@Controller
@RequestMapping("repertoryController")
public class repertoryController {


    @Resource
    private RepertoryService repertoryService;

    @RequestMapping("addRepertory")
    public String addRepertory(String aid){
        System.out.println(aid);
        boolean b = repertoryService.addRepertory(aid);
        if (b){
            return "repertory";
        }else {
            return "error";
        }
    }

    @RequestMapping("chaAllRepertory")
    @ResponseBody
    public List<TableRepertory> chaAllRepertory(){
        return repertoryService.chaAllRepertory();
    }





}
