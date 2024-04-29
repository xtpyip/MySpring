package com.pyip.edu.utils;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * @author 应癫
 */
public class DruidUtils {

    private DruidUtils(){
    }

    private static DruidDataSource druidDataSource = new DruidDataSource();


    static {
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/bank?useSSL=False&characterEncoding=utf-8");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("10086");

    }

    public static DruidDataSource getInstance() {
        return druidDataSource;
    }

}
