package com.greygao.dynamicdatasource.controller;

import com.greygao.dynamicdatasource.datasource.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @class name MyController
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/9/12 21:27
 * @Version 1.0
 **/
@RestController
@RequestMapping("/user")
public class MyController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/queryAll")
    @DataSource("local")
    public String queryAllUser(){
        String sql = "select * from sys_user_info";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return maps.toString();
    }


    @RequestMapping("/queryAllRemote")
    @DataSource("remote")
    public String queryAllUserRemote(){
        String sql = "select * from sys_user_info";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return maps.toString();
    }

}
