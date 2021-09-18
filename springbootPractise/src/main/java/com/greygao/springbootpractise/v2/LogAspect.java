package com.greygao.springbootpractise.v2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @class name LogAspect
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/7/11 13:47
 * @Version 1.0
 **/
@Aspect
@Component
public class LogAspect {


    @Before("execution(* com.greygao.springbootpractise.v2.FunctionService.*(..))")
    public void startlogallmethod(){
        System.out.println("开始记录日志信息");
    }

    @Before("execution(String com.greygao.springbootpractise.v2.FunctionService.doOneTask(..))")
    public void startlog(JoinPoint point){
        Object[] args = point.getArgs();
        for (int i = 0; i < args.length; i++) {
            System.out.println("ponit args   " + args[i]);
        }
        System.out.println("开始指定方法的日志记录！！");
    }


    @After("@annotation(com.greygao.springbootpractise.v2.ActionTest)")
    public void endlog(){
        System.out.println("通过自定义注解的方式，记录方法结束日志xxxx");
    }


}
