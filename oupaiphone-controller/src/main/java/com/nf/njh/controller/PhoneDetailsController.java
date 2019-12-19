package com.nf.njh.controller;

import com.github.pagehelper.PageInfo;
import com.nf.njh.entity.PhoneDetails;
import com.nf.njh.service.PhoneDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/phone")
public class PhoneDetailsController {
    @Autowired
    private PhoneDetailsService detailsService;

    @RequestMapping("/list")
    public String getAllPhoneDetails(@RequestParam(value = "pageNum",defaultValue = "1",required = false)int pageNum,
                                     @RequestParam(value = "pageSize",defaultValue = "3",required = false)int pageSize,
                                     Model model ){
        List<PhoneDetails> details = detailsService.getAllPhone(pageNum, pageSize);
        PageInfo pageInfo = new PageInfo(details);
        model.addAttribute("phoneList",pageInfo);
        return "phoneDetails";
    }
    //添加手机页面
    @RequestMapping("/addphone")
    public String addPhoneUi(){
        return "phoneadd";
    }
//添加手机信息
    @RequestMapping("/insertphone")
    @ResponseBody
    public String insertPhone(@Valid PhoneDetails details, BindingResult bindingResult){

            detailsService.addphone(details);

            return "phone/addphone";

    }

    @RequestMapping("/delphone")
    public String deletePhone(Integer phoneid){
        detailsService.deletephone(phoneid);
        return "forward:phoneDetails";
    }

    @RequestMapping("/update")
    public String updatePhone(PhoneDetails details){
        detailsService.updtephone(details);
        return "redirect:phoneupdate";
    }


}
