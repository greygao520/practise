package com.greygao.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @class name HelloController
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/9/7 22:25
 * @Version 1.0
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/test1")
    public String test1(){
        return "hello---test1";
    }
}
