package com.shiro.security;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class MyFormAuthenrazitionFilter extends FormAuthenticationFilter {

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {

        boolean a =  super.isAccessAllowed(request, response, mappedValue);
        return  a;
    }
}
