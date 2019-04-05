package com.jekins.jekinsgit.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jingfei
 * @Date: 2019/4/4 21:21
 * @Version 1.0
 */
@RestController
public class HelloController {

    private static final Logger logger = Logger.getLogger(HelloController.class);


    @RequestMapping("hello")
    public String hello(){
        logger.info("开始");
        return "Hello World";
    }
}
