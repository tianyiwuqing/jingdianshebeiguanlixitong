package com.lynu.controller;

import com.lynu.bean.*;
import com.lynu.service.SrcapService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @author 天意无情
 * @date 2019-04-12 23:13
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
        return tableRepertories;
    }

    @RequestMapping("addScrapbills")
    @ResponseBody
    public boolean addScrapbills(TableScrap scrap) {
        boolean b = srcapService.addScrapbills(scrap);
        return b;
    }

    @RequestMapping("chaOfKeyEmployee")
    @ResponseBody
    public List<TableEmployee> chaOfKeyEmployee() {
       return srcapService.chaOfKeyEmployee();
    }

    @RequestMapping("chaAllScrap")
    @ResponseBody
    public List<TableScrap> chaAllScrap() {
        List<TableScrap> tableScraps = srcapService.chaAllScrap();
        return tableScraps;
    }


    @RequestMapping("delKeyScrapbills")
    @ResponseBody
    public boolean delKeyScrapbills(String sid) {
        return srcapService.delKeyScrapbills(sid);

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
        return srcapService.chaOfDeleterScrap();
    }

    @RequestMapping("delOutRepertory")
    @ResponseBody
    public boolean delOutRepertory(String rid) {
    return srcapService.delOutRepertory(rid);
    }


}
