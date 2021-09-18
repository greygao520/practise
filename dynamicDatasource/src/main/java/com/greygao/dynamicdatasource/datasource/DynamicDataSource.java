package com.greygao.dynamicdatasource.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

/**
 * @class name DynamicDataSource
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/9/12 20:51
 * @Version 1.0
 **/
public class DynamicDataSource extends AbstractRoutingDataSource {


    public DynamicDataSource(DataSource defaultDataSource, Map<Object,Object> map) {
        //设置默认的数据源
        super.setDefaultTargetDataSource(defaultDataSource);
        //设置目标数据源map
        super.setTargetDataSources(map);
        super.afterPropertiesSet();
    }

    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceContextHolder.getDataSourceType();
    }

}
