package com.greygao.springbootpractise.v3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @class name Main
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/7/13 23:10
 * @Version 1.0
 **/

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ServiceOne service1 = (ServiceOne)context.getBean("serviceOne");
        ServiceOne service2 = (ServiceOne)context.getBean("serviceOne");
//        System.out.println(service1 == service2);
//        System.out.println("service1  " + service1);
//        System.out.println("service2  " + service2);
//        System.out.println(service1.getCar());
//        System.out.println(service2.getCar());


        new Thread(()->{
            service1.setUserName("zhangsan");
            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(service1.getUserName());
            }

        }).start();


        new Thread(()->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            service2.setUserName("lisi");
        }).start();



    }
}
