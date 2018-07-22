package com.mr.demo.web.filter;


import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

//@Component
public class TimeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("-------------TimeFilter init--------------");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        long start = new Date().getTime();
        System.out.println("-------------TimeFilter time start--------------" + start);
        chain.doFilter(request, response);
        System.out.println("-------------TimeFilter time finish interval--------------" + (new Date().getTime() - start));
    }

    @Override
    public void destroy() {
        System.out.println("-------------TimeFilter destroy--------------");
    }
}
