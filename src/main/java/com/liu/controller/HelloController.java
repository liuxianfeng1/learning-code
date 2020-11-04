package com.liu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package: com.liu.controller
 * @ClassName: HelloController
 * @Author: 刘先锋
 * @CreateTime: 2020/11/2 17:10
 * @Description:
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello,springboot";
    }


}
