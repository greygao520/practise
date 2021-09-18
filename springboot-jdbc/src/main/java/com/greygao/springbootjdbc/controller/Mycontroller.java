package com.greygao.springbootjdbc.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.greygao.springbootjdbc.entity.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @class name Mycontroller
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/9/11 14:04
 * @Version 1.0
 **/
@RestController
public class Mycontroller {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/user/insert")
    public String insertUser( @RequestBody String jsonStr) {
        System.out.println(jsonStr);
        JSONObject result = new JSONObject();
        try {
            UserModel userModel = JSONObject.parseObject(jsonStr, UserModel.class);
            int update = jdbcTemplate.update(new PreparedStatementCreator() {
                @Override
                public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                    String sql = "insert into sys_user_info (name,age,gender,mail,phone) values (?,?,?,?,?)";
                    PreparedStatement ps = connection.prepareStatement(sql);
                    ps.setString(1, userModel.getName());
                    ps.setInt(2, userModel.getAge());
                    ps.setString(3, userModel.getGender());
                    ps.setString(4, userModel.getMail());
                    ps.setString(5, userModel.getPhone());
                    return ps;
                }
            });
            if (update > 0) {
                result.put("errCode", "200");
                result.put("errMsg", "insert success");
            } else {
                result.put("errCode", "600");
                result.put("errMsg", "insert error");
            }
        } catch (Exception e) {
            e.printStackTrace();
            result.put("errCode", "500");
            result.put("errMsg", e.getMessage());
            System.out.println("message: " + e.getMessage());
        }
        return result.toString();
    }


    @RequestMapping("/user/delete/{userId}")
    public String deleteUser(@PathVariable("userId") String userId){
        System.out.println(userId);
        JSONObject result = new JSONObject();
        try {
            String sql = "delete from sys_user_info where id = ?";
            int update = jdbcTemplate.update(sql, userId);
            if (update > 0) {
                result.put("errCode", "200");
                result.put("errMsg", "insert success");
            } else {
                result.put("errCode", "600");
                result.put("errMsg", "insert error");
            }
        }catch (Exception e){
            e.printStackTrace();
            result.put("errCode", "500");
            result.put("errMsg", e.getMessage());
            System.out.println("message: " + e.getMessage());
        }
        return result.toString();
    }

    @RequestMapping("/user/queryAll")
    public String queryUser(){
        JSONObject result = new JSONObject();
        try {
            String sql = "select * from sys_user_info";
            List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
            if (list.size() > 0) {
                result.put("errCode", "200");
                result.put("errMsg", "insert success");
                JSONArray jsonArray = new JSONArray();
                for (Map<String, Object> map :list) {
                    UserModel userModel = new UserModel();
                    userModel.setId((Integer) map.get("id"));
                    userModel.setName((String) map.get("name"));
                    userModel.setAge((Integer) map.get("age"));
                    userModel.setGender((String) map.get("gender"));
                    userModel.setMail((String) map.get("mail"));
                    userModel.setPhone((String) map.get("phone"));
                    JSONObject o = (JSONObject) JSONObject.toJSON(userModel);
                    jsonArray.add(o);
                }
                result.put("data",jsonArray.toJSONString());
            } else {
                result.put("errCode", "600");
                result.put("errMsg", "result is empty");
            }
        }catch (Exception e){
            e.printStackTrace();
            result.put("errCode", "500");
            result.put("errMsg", e.getMessage());
            System.out.println("message: " + e.getMessage());
        }
        return result.toString();
    }

}