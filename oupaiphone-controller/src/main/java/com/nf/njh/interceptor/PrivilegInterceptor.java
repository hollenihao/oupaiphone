package com.nf.njh.interceptor;


import com.nf.njh.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class PrivilegInterceptor implements HandlerInterceptor {

    @Autowired
    private UserInfoService userInfoService;


}
