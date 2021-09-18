package com.greygao.springbootdemo;

import com.greygao.springbootdemo.filter.Myfilter;
import com.greygao.springbootdemo.servlet.Myservlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean<Myservlet> bean = new ServletRegistrationBean<Myservlet>(new Myservlet());
        return bean;
    }
}
