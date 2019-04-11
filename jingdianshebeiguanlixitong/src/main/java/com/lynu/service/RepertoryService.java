package com.lynu.service;

import com.lynu.bean.TableRepertory;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 天意无情
 * @date 2019-04-03 11:06
 */
public interface RepertoryService {

    /**
     * 查询所有库存
     * @return
     */
    List<TableRepertory> chaAllRepertory();

    /**
     * 入库
     * @return
     */
    boolean addRepertory(String aid);

    /**
     * 删除所有库存
     * @return
     */
    boolean delAllRepertory();

    /**
     * 根据id删除库存
     * @param rid
     * @return
     */
    boolean delRepertory(String rid);

    /**
     * 查询数据数量
     * @return
     */
    Integer chaCount(HttpSession session);


}
