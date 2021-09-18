package com.greygao.dynamicdatasource.datasource;

import javax.sql.DataSource;

/**
 * @class name DynamicDataSourceContextHolder
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/9/12 20:38
 * @Version 1.0
 **/
public class DynamicDataSourceContextHolder {


    /**
     * 使用ThreadLocal维护变量，ThreadLocal为每个使用该变量的线程提供独立的变量副本；
     * 所以每一个线程都可以独立修改自己的副本，而不会影响其他线程的变量副本
     */
    private static final ThreadLocal<String> DATA_SOURCE_CONTEXT = new ThreadLocal<>();


    public static void setDataSourceType(String type){
        System.out.println("切换到" + type +"数据源");
        DATA_SOURCE_CONTEXT.set(type);
    }

    /**
     * 获取数据源类型
     * @return
     */
    public static String getDataSourceType(){
        return DATA_SOURCE_CONTEXT.get();
    }

    /**
     * 清除数据源类型
     */
    public static void clearDataSourceType(){
        DATA_SOURCE_CONTEXT.remove();
    }




}
