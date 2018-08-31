package com.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        String uri = request.getRequestURI();
        //判断当前请求地址是否是登录/注册地址
        if (!(uri.contains("Login") || uri.contains("login") || uri.contains("register"))) {
            //非登录请求
            if (request.getSession().getAttribute("user") != null) {
                //说明已经登录过,放行
                return true;
            } else {
                //静态资源放行
                if (uri.contains("css") || uri.contains("js") || uri.contains("images")) {
                    return true;
                } else {
                    //没有登录,跳转到登录界面
                    response.sendRedirect(request.getContextPath() + "/user/login");
                }
            }
        } else {
            //登录请求 ,直接放行
            return true;
        }
        return false;

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) throws Exception {

    }
}
