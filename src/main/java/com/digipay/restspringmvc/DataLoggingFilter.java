package com.digipay.restspringmvc;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;

import java.io.IOException;

@WebFilter(value= "/user")
public class DataLoggingFilter extends HttpFilter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("Filter applied!!! ");
        chain.doFilter(request,response);

    }
}
