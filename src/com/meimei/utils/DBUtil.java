package com.meimei.utils;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

public class DBUtil {
    private static  DruidDataSource dataSource;

    public static void main(String[] args) {
        System.out.println(dataSource);
    }
    static {

        try{
            Properties properties=new Properties();
            InputStream is=DBUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
            properties.load(is);
            dataSource=new DruidDataSource();
            dataSource.setUsername(properties.getProperty("jdbc.username"));
            dataSource.setPassword(properties.getProperty("jdbc.password"));
            dataSource.setDriverClassName(properties.getProperty("jdbc.driverClassName"));
            dataSource.setUrl(properties.getProperty("jdbc.url"));
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static DataSource   getDataSource(){
        return dataSource;
    }


}
