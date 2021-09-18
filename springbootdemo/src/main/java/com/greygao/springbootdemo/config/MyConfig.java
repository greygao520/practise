package com.greygao.springbootdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @class name MyConfig
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/9/8 22:50
 * @Version 1.0
 **/
@Configuration
public class MyConfig implements WebMvcConfigurer {


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        WebMvcConfigurer.super.addViewControllers(registry);
        registry.addViewController("test2").setViewName("success");
    }
}
