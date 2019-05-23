package com.hbx.shop.filter;

import com.sun.net.httpserver.Filter;
import com.sun.net.httpserver.HttpExchange;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;



//@WebFilter(urlPatterns = "/*", filterName = "TestFilter1")
public class TestFilter1 implements javax.servlet.Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        Long startTime =  System.currentTimeMillis();
        System.out.print("\n");
        System.out.print("start1");
        System.out.print("\n");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.print("\n");
        System.out.print("end1  cost: " + (System.currentTimeMillis() - startTime));
        System.out.print("\n");




    }

    @Override
    public void destroy() {

    }
}
