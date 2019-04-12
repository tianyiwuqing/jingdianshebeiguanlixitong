package com.lynu.filter;


import com.lynu.bean.TableEmployee;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 天意无情
 * @date 2019-04-09 17:43
 */
public class MyFilter implements Filter {

    private String redirectUrl="";

    private static List<String> passUrls = new ArrayList<>();

    private String ctxPath = null;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        redirectUrl = filterConfig.getInitParameter("redirectURL");
        // 获取web.xml中的初始化参数
        String ignoreURL = filterConfig.getInitParameter("passURL");
        // 保存不拦截的url
        String[] ignoreURLArray = ignoreURL.split(",");
        for (String url : ignoreURLArray) {
            passUrls.add(url.trim());
        }
        ctxPath = filterConfig.getServletContext().getContextPath();
        System.out.println("ctx = " + ctxPath);
        System.out.println("不拦截的URL包括:");
//        for (String url : passUrls) {
//            System.out.println(url);
//        }
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        HttpServletResponse response=(HttpServletResponse)servletResponse;

        // 请求的url
        String url = request.getRequestURI();
        // 相对路径
        String subUrl = url.substring(ctxPath.length() + 1);
        for (String urlStr : passUrls) {
            // 如果匹配, 则放行
            if (subUrl.indexOf(urlStr) > -1) {
                filterChain.doFilter(request, response);
                return;
            }
        }

        HttpSession session = request.getSession();
        TableEmployee loginUser = (TableEmployee) session.getAttribute("LoginUser");
        if (loginUser!=null){
            filterChain.doFilter(request,response);
        }else{
            response.sendRedirect(request.getContextPath()+"/login.jsp");
        }
    }

    @Override
    public void destroy() {

    }
}
