package com.lynu.tools;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 数据装换工具类
 */
public class DataUtil {

    /**
     * 将数据库获取到的数据整理转换成前台需要的数据
     * @param data
     */
    public static void dbMap2Forward(List<Map<String,Object>> data){
        if(data == null || data.isEmpty()){
            return;
        }

        for (Map<String,Object> map : data) {
            for(Map.Entry<String,Object> entry : map.entrySet()){
                if(entry.getValue() instanceof Timestamp){
                    if(entry.getValue() == null){
                        continue;
                    }
                    map.put(entry.getKey(),new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(((Timestamp) entry.getValue()).getTime())));
                }
            }
        }
    }
}
