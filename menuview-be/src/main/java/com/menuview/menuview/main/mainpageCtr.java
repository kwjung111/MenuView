package com.menuview.menuview.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class mainpageCtr {

    @Autowired
    mainpageSvc service;

    @GetMapping
    public String mainpage(Model model){
        model.addAttribute("date", new java.util.Date());//view 로 데이터전달
        return "mainpage/mainpage";
    }

    @GetMapping("test")
    @ResponseBody
    public Object mainpageTest(){
        Object rtnObj = service.test01();
        return rtnObj;
    }
}
