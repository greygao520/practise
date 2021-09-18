package com.greygao.springbootpractise.v1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

/**
 * @class name ConfigTest
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/7/11 13:20
 * @Version 1.0
 **/

@Configuration
public class ConfigTest {

    @Bean
    public ServiceDemo serviceDemo (FunctionDemo functionDemo){
        return new ServiceDemo(functionDemo);
    }

    @Bean
    public FunctionDemo functionDemo(){
        return new FunctionDemo();
    }

}
