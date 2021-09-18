package com.greygao.springbootpractise.v1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @class name Main
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/7/11 13:28
 * @Version 1.0
 **/
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigTest.class);
        ServiceDemo serviceDemo = (ServiceDemo) context.getBean("serviceDemo");
        serviceDemo.say("hahahahhahahaha");


    }
}
