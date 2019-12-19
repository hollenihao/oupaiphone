package com.nf.njh.controller;

import com.github.pagehelper.PageInfo;
import com.nf.njh.entity.UserInfo;
import com.nf.njh.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {

@Autowired
private UserInfoService userInfoService;



    @RequestMapping("/index")
    public String index(@RequestParam(value = "pageNum" ,defaultValue = "1",required = false) int pageNum,
                        @RequestParam(value = "pageSize",defaultValue = "2",required = false)int pageSize,
                        Model model){
        List<UserInfo> result = userInfoService.getAllUser(pageNum, pageSize);
        PageInfo pageInfo = new PageInfo(result);
        model.addAttribute("lists",pageInfo);

        return "userList";
    }


}
