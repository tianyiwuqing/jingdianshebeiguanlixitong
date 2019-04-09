package com.lynu.filter;


import com.lynu.bean.TableEmployee;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author 天意无情
 * @date 2019-04-09 17:43
 */
public class MyFilter implements Filter {

    private String redirectUrl="";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        redirectUrl = filterConfig.getInitParameter("redirectURL");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        HttpServletResponse response=(HttpServletResponse)servletResponse;

        HttpSession session = request.getSession();
        TableEmployee loginUser = (TableEmployee) session.getAttribute("LoginUser");
        if (loginUser!=null){
            filterChain.doFilter(request,response);
        }else{
            response.sendRedirect("/"+redirectUrl);
        }


    }

    @Override
    public void destroy() {

    }
}
