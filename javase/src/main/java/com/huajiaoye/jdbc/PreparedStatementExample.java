package com.huajiaoye.jdbc;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PreparedStatementExample {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(PreparedStatementExample.class.getName());

        String jdbcUrl = "jdbc:mysql://localhost:3306/world";
        String user = "root";
        String password = "1234";

        // 1. 创建 mysql连接对象
        try (Connection connection = DriverManager.getConnection(jdbcUrl, user, password)) {
            // 2. 创建 PreparedStatement 对象，使用占位符表示参数
            String sql = "SELECT * FROM city WHERE CountryCode= ? AND Population > ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                // 设置参数值
                preparedStatement.setString(1, "CHN");
                preparedStatement.setInt(2, 1000000);
                //3. 执行查询
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    //4. 处理查询结果
                    while (resultSet.next()) {
                        int id = resultSet.getInt("ID");
                        String name = resultSet.getString("Name");
                        String countryCode = resultSet.getString("CountryCode");
                        int population = resultSet.getInt("Population");

                        // 其他列

                        // 打印输出
                        System.out.printf("ID: %d Name: %s CountryCode: %s Population: %d%n", id, name, countryCode, population);
                    }
                }
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "异常", e);
        }
    }
}
