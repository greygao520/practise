package com.greygao.springbootpractise.v3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @class name Main2
 * @Description 实验结论：synchronized 锁定的对象必须是同一个对象的同一个实例
 * @Author GreyGao
 * @Date 2021/7/26 13:31
 * @Version 1.0
 **/
public class Main2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        ServiceOne serviceOne = (ServiceOne)context.getBean("serviceOne");
        ServiceOne serviceOne2 = (ServiceOne)context.getBean("serviceOne");


        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                serviceOne.print("11111111111111111111111111");
            }

        }).start();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                serviceOne2.print("22222222222222222222222222");
            }
        }).start();



    }
}
