package com.menuview.menuview.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class mainpageCtr {

    @Autowired
    mainpageSvc service;

    @GetMapping
    @ResponseBody
    public String mainpage(){
        return "mainpage/mainpage";
    }

    @GetMapping("test")
    @ResponseBody
    public Object mainpageTest(){
        Object rtnObj = service.test01();
        return rtnObj;
    }
}
