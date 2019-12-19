package com.nf.njh.controller;

import com.nf.njh.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserInfoController {
@Autowired
private UserInfoService userInfoService;

    @RequestMapping("/insert")
    public String insert(){
        return "phoneadd";
    }



}
