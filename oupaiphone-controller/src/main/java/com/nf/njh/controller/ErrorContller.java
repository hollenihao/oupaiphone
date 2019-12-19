package com.nf.njh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorContller {
    @RequestMapping("/error")
    public String error(){
        return "404";
    }
}
