package com.lynu.service;

import com.lynu.bean.TableRepertory;

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


}
