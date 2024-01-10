package com.huajiaoye.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DruidExample {
    public static void main(String[] args) {
        DruidDataSource dataSource = DataSourceConfig.getDataConfig();
        // 1. 创建 Connection 对象 ，将原来的 DriverManager 变成 dataSource
        try (Connection connection = dataSource.getConnection()){
            // 2. 创建 PreparedStatement 对象
            String sql = "SELECT * FROM city WHERE CountryCode = ? AND Population > ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)){
                // 设置参数
                statement.setString(1,"CHN");
                statement.setInt(2,1000000);
                // 3. 执行查询
                try (ResultSet resultSet = statement.executeQuery()){
                    // 处理查询
                    while (resultSet.next()){
                        int id = resultSet.getInt("ID");
                        String name = resultSet.getString("Name");
                        String countryCode = resultSet.getString("CountryCode");
                        int population = resultSet.getInt("Population");

                        // 其他列

                        // 格式化输出 printf
                        System.out.printf("ID: %d Name: %s CountryCode: %s Population %d%n",
                                id,
                                name,
                                countryCode,
                                population);
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
