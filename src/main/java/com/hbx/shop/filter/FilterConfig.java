package com.hbx.shop.filter;


import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean registrationBean(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new TestFilter1());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("testFilter1");
        registrationBean.setOrder(1);
        return registrationBean;
    }


    @Bean
    public FilterRegistrationBean registrationBean2(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new TestFilter2());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("testFilter2");
        registrationBean.setOrder(2);
        return registrationBean;
    }

}
