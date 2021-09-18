package com.greygao.springbootdemo.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @class name Person
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/9/7 22:30
 * @Version 1.0
 **/
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private String name;

    private Integer age;

    private List<String> jobs;

    private Integer code;

    private String uuid;

    public Person(){

    }

    public Person(String name, Integer age, List<String> jobs, Integer code,String uuid) {
        this.name = name;
        this.age = age;
        this.jobs = jobs;
        this.code = code;
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getJobs() {
        return jobs;
    }

    public void setJobs(List<String> jobs) {
        this.jobs = jobs;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", jobs=" + jobs +
                ", code=" + code +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
