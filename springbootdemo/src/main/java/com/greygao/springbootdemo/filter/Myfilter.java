package com.greygao.springbootdemo.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @class name Myfilter
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/9/8 23:00
 * @Version 1.0
 **/
@WebFilter(filterName = "Myfilter",urlPatterns = "/sevlet")
@Component
public class Myfilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        System.out.println("filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String servletContextName = servletRequest.getServletContext().getServletContextName();
        System.out.println("进入了myfilter");
        filterChain.doFilter(servletRequest, servletResponse);
    }


    @Override
    public void destroy() {
        Filter.super.destroy();
        System.out.println("filter destory");
    }
}
