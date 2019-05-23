package com.hbx.shop.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;



//@WebFilter(urlPatterns = "/*", filterName = "TestFilter2")
public class TestFilter2 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.print("\n");
        Long startTime =  System.currentTimeMillis();
        System.out.print("start2");
        System.out.print("\n");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.print("\n");
        System.out.print("end2  cost: " + (System.currentTimeMillis() - startTime));
        System.out.print("\n");
    }

    @Override
    public void destroy() {

    }
}
