package com.czxy.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @projectName demo01
 * @title: HelloController
 * @author: FengYuan
 * @create: 2019-07-01 09:00
 **/
public class HelloController {


    @RequestMapping("show01.action")
    public String show() {

        return "static/show01.html";
    }

}
