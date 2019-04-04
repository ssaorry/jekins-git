package com.jekins.jekinsgit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jingfei
 * @Date: 2019/4/4 21:21
 * @Version 1.0
 */
@RestController
public class HelloController {
    @RequestMapping("hello")
    public String hello(){
        return "Hello World";
    }
}
