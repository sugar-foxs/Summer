package com.guchunhui.filter;

import com.sun.xml.internal.ws.util.StringUtils;
import sun.swing.StringUIClientPropertyKey;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by gch on 16-10-20.
 */
//@WebFilter(filterName = "LoginFilter",urlPatterns = "/*",
//        initParams = {@WebInitParam(name = "forbid",value = "jsps"),
//                      @WebInitParam(name = "pass",value = "gologin;goregister;login;register")}
//)
public class LoginFilter implements Filter{

    String forbid ;
    String pass;
    String[] passArray;
    public void init(FilterConfig filterConfig) throws ServletException {
        forbid = filterConfig.getInitParameter("forbid");
        pass = filterConfig.getInitParameter("pass");
        passArray = pass.split(";");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        HttpSession session = request.getSession();
        if(request.getRequestURI().contains(forbid)){
            request.getRequestDispatcher("/gologin.do").forward(request,response);
            return;
        }
        for(String s:passArray){
            if(request.getRequestURI().contains(s)){
                filterChain.doFilter(request,response);
                return;
            }
        }
        if(request.getRequestURI().contains(".do")){
//            System.out.println(session.getAttribute("customer"));
            if(session.getAttribute("customer")==null){
                request.getRequestDispatcher("/gologin.do").forward(request,response);
                return;
            }
        }
        filterChain.doFilter(request,response);
    }

    public void destroy() {

    }
}
