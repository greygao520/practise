package com.greygao.springbootpractise.v2;

import org.springframework.stereotype.Service;

import javax.xml.ws.Action;

/**
 * @class name FunctionService
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/7/11 13:53
 * @Version 1.0
 **/
@Service
public class FunctionService {

    public String doSomethings (){
        System.out.println("do somethings; do somethings ");
        return "200";
    }

    public String doOneTask (String content){
        System.out.println(content);
        return "200";
    }

    @ActionTest(name = "注解式拦截的操作")
    public void doLastThings(){
        System.out.println("do last things");
    }
}
