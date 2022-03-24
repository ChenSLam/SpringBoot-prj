package com.bjpowernode.controller;

import com.bjpowernode.vo.SchoolInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class HelloSpringBoot {
    @Value("${server.port}")
    private Integer port;
    @Value("${school.name}")
    private String name;
    @Resource
    private SchoolInfo info;
    @RequestMapping("/hello")
    @ResponseBody
    public String helloSpringBoot(){
        return "欢迎使用SpringBoot框架"+name+port;
    }
    @RequestMapping("/info")
    @ResponseBody
    public String queryInfo(){
        return "欢迎使用SpringBoot框架"+info.toString();
    }
}
