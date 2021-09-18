package com.greygao.springbootpractise.v2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @class name Main
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/7/11 13:46
 * @Version 1.0
 **/
@ComponentScan
@Configuration
@EnableAspectJAutoProxy
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        FunctionService functionService = (FunctionService) context.getBean("functionService");
//        functionService.doSomethings();
        functionService.doOneTask("do one task");
//        functionService.doLastThings();

    }
}
