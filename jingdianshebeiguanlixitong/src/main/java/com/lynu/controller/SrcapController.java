package com.lynu.controller;

import com.lynu.bean.TableEmployee;
import com.lynu.bean.TableRepertory;
import com.lynu.bean.TableScrap;
import com.lynu.service.SrcapService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 天意无情
 * @date 2019-04-11 17:11
 */
@Controller
@RequestMapping("srcapController")
public class SrcapController {


    @Resource
    private SrcapService srcapService;


    @RequestMapping("chaSoure")
    @ResponseBody
    public List<TableRepertory> chaSoure(String bmid, String sbfl) {
        List<TableRepertory> tableRepertories = srcapService.chaSoure(bmid, sbfl);
        for (TableRepertory tableRepertory : tableRepertories) {
        }
        return srcapService.chaSoure(bmid, sbfl);
    }

    @RequestMapping("addScrapbills")
    public void addScrapbills(TableScrap tableScrap) {
        boolean b = srcapService.addScrapbills(tableScrap);
    }

    @RequestMapping("chaOfKeyEmployee")
    @ResponseBody
    public List<TableEmployee> chaOfKeyEmployee(){
        return srcapService.chaOfKeyEmployee();
    }

    @RequestMapping("chaAllScrap")
    @ResponseBody
    public List<TableScrap> chaAllScrap() {
        return srcapService.chaAllScrap();
    }

    @RequestMapping("delKeyScrapbills")
    @ResponseBody
    public boolean delKeyScrapbills(String did) {
        boolean b = srcapService.delKeyScrapbills(did);
        System.out.println(b);
        return b;
    }


    @RequestMapping("scrapCount")
    @ResponseBody
    public Integer scrapCount(HttpSession session) {
        Integer integer = srcapService.scrapCount();
        session.setAttribute("scrapcount",integer);
        return integer;
    }

    @RequestMapping("chaOfDeleterScrap")
    @ResponseBody
    public List<TableRepertory> chaOfDeleterScrap() {
        List<TableRepertory> tableRepertories = srcapService.chaOfDeleterScrap();
        return tableRepertories;
    }

    @RequestMapping("delOutRepertory")
    @ResponseBody
    public boolean delOutRepertory(String rid) {
        return srcapService.delOutRepertory(rid);
    }
}
