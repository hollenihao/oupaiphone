package com.nf.njh.controller;

import com.nf.njh.entity.UserInfo;
import com.nf.njh.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/")
    public String index(){
        return "login";
    }

    @RequestMapping("/login")
    public ModelAndView  login(@Valid UserInfo userInfo, BindingResult bindingResult, HttpServletRequest req, HttpSession session) throws UnsupportedEncodingException {
        req.setCharacterEncoding("UTF-8");
        ModelAndView mav = new ModelAndView();
        String uName = req.getParameter("uName");
            String uPassword = req.getParameter("uPassword");
            userInfo = userInfoService.queryUser(uName,uPassword);
            if (bindingResult.hasErrors()){
                List<FieldError> errors = bindingResult.getFieldErrors();
                for (FieldError error: errors){
                    mav.addObject(error.getField() + "Error", error.getDefaultMessage());
                }
            }
            if (userInfo == null){
                mav.setViewName("login");
                mav.addObject("error","*账号或密码错误");
            }else {
                mav.setViewName("home");
                session.setAttribute("username",uName);
            }
            return mav;
    }
}
