package com.lynu.service;

import com.lynu.bean.TableEmployee;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author 28449
 * @since 2019-01-28 17:18
 */
public interface LoginService {

    /**
     * 登录验证
     * @param user
     * @param password
     * @return
     */
    boolean login(String user, String password, HttpSession session);

    /**
     * 获取cookie登录信息
     * @return
     */
    TableEmployee chaLoginUSer(HttpSession session);

    /**
     * 退出登录
     * @return
     */
    boolean returnLogin(HttpSession session);
}
