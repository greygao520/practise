package com.greygao.springbootpractise.v3;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import proxy.Car;

/**
 * @class name ServiceOne
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/7/13 23:12
 * @Version 1.0
 **/
@Service(value = "serviceOne")
@Scope("prototype")
public class ServiceOne {

    private String userName;

    public Car getCar() {
        return car;
    }

    private Car car;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void print(String content){
        synchronized (this){
            System.out.println("打印内容：" + content);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
