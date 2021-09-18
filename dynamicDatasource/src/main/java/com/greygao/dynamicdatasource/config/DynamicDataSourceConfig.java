package com.greygao.dynamicdatasource.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.greygao.dynamicdatasource.datasource.DynamicDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;

/**
 * @class name DynamicDataSourceConfig
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/9/12 20:48
 * @Version 1.0
 **/
@Configuration
public class DynamicDataSourceConfig {


    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.local")
    public DataSource localDataSource(){
        return new DruidDataSource();
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.remote")
    public DataSource remoteDataSource(){
        return new DruidDataSource();
    }

    @Bean
    @Primary
    public com.greygao.dynamicdatasource.datasource.DynamicDataSource dynamicDataSource(DataSource localDataSource, DataSource remoteDataSource){
        HashMap<Object, Object> map = new HashMap<>();
        map.put("local",localDataSource);
        map.put("remote",remoteDataSource);
        return new DynamicDataSource(localDataSource,map);

    }
}
