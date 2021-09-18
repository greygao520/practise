package com.greygao.juc.c01;

/**
 * @class name Reflact
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/7/26 13:49
 * @Version 1.0
 **/
public class Reflact {


    public static void main(String[] args) throws ClassNotFoundException {

        try {
            Class<?> aClass = Class.forName("org.slf4j.LoggerFactory");
            Class<?> otherClass = Class.forName("redis.clients.jedis");

            System.out.println(aClass.getSimpleName());
            System.out.println(otherClass.getSimpleName());
        }catch (ClassNotFoundException e){
            System.out.println(e);
            e.printStackTrace();
        }


    }


}
