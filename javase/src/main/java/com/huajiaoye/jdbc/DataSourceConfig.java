package com.huajiaoye.jdbc;
import com.alibaba.druid.pool.DruidDataSource;

public class DataSourceConfig {
    public static DruidDataSource getDataConfig(){
        DruidDataSource dataSource = new DruidDataSource();
        // 数据库连接配置
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/world");
        dataSource.setUsername("root");
        dataSource.setPassword("1234");

        // 连接池设置
        dataSource.setInitialSize(5); // 初始连接数
        dataSource.setMaxActive(10);  // 最大连接数
        dataSource.setMinIdle(2);     // 最小空闲连接数
        dataSource.setMinIdle(5);     // 最大空闲连接数
        dataSource.setMaxWait(5000);  // 最大等待时间，毫秒
        dataSource.setMinEvictableIdleTimeMillis(300000); // 设置连接最小空间时间,毫秒，超过这个时间被判为空闲
        return dataSource;
    }
}
