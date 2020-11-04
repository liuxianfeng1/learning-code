package com.liu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

/**
 * @Package: com.liu.controller
 * @ClassName: IndexController
 * @Author: 刘先锋
 * @CreateTime: 2020/11/2 17:45
 * @Description:  使用模板引擎改首頁
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/test")
    public String test(Model model){

        model.addAttribute("msg","<h1>Hello</h1>");

        model.addAttribute("users", Arrays.asList("liuxianfeng","houshuwei"));

        return "test";
    }

}
