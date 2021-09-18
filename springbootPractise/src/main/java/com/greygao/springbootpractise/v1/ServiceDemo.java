package com.greygao.springbootpractise.v1;

/**
 * @class name ServiceDemo
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/7/11 13:24
 * @Version 1.0
 **/
public class ServiceDemo {

    private FunctionDemo functionDemo;

    public ServiceDemo(FunctionDemo functionDemo){
        this.functionDemo = functionDemo;
    }

    public void say(String somethings){
        functionDemo.saySomething(somethings);
    }


}
