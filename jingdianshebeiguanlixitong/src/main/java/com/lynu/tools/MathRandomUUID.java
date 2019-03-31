package com.lynu.tools;

import java.util.Random;

/**
 * @author 天意无情
 * @date 2019-03-26 20:39
 */
public class MathRandomUUID {


    private static String characters = "0123456789";

    /**
     *
     * @param index 字符串位数
     * @return 返回字符串数字
     */
    public static String UUidRandom(int index) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < index; i++) {
            sb.append(characters.charAt(random.nextInt(10)));
        }
        return sb.toString();
    }


}
