package com.lynu.service;

import com.lynu.bean.TableEmployee;
import com.lynu.bean.TableEmployeeExample;
import com.lynu.bean.TableRepertory;
import com.lynu.bean.TableScrap;

import java.util.List;

/**
 * @author 天意无情
 * @date 2019-04-11 17:13
 */
public interface SrcapService {


    /**
     * 查询库存
     * @return
     */
    List<TableRepertory> chaSoure(String bmid,String sbfl);

    /**
     * 添加报废清单
     * @param scrap
     * @return
     */
    boolean addScrapbills(TableScrap scrap);

    /**
     * 查询设备科人员
     * @return
     */
    List<TableEmployee> chaOfKeyEmployee();

    /**
     * 查询所有的报废单
     * @return
     */
    List<TableScrap> chaAllScrap();

    /**
     * 根据订单id删除
     * @param sid
     * @return
     */
    boolean delKeyScrapbills(String sid);

    /**
     * 查询订单数量
     * @return
     */
    Integer scrapCount();


    /**
     * 查询需要因报废出库的订单
     * @return
     */
    List<TableRepertory> chaOfDeleterScrap();

    /**
     * 报废出库
     * @param rid
     * @return
     */
    boolean delOutRepertory(String rid);

}
