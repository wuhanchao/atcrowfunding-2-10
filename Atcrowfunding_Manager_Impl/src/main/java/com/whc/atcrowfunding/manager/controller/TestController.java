package com.whc.atcrowfunding.manager.controller;

import com.whc.atcrowfunding.manager.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {

    @Autowired
    private TestService testService;

    public TestController(){
        System.out.println("TestController....");
    }

    @RequestMapping("/test")
    public String test(){
        System.out.println("Test");
        testService.insert();
        return "success";
    }

}
