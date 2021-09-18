package com.greygao.springbootdemo;

import com.greygao.springbootdemo.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class SpringbootdemoApplicationTests {

    @Autowired
    private Person person;

    @Test
    void contextLoads() {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.greygao.springbootdemo");
//        Person person = (Person) context.getBean("person");
        System.out.println(person);


    }



}
