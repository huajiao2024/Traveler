package com.huajiaoye.jdbc;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StatementExample {
    public static void main(String[] args) {

        // 获取默认的 Logger
        final Logger logger = Logger.getLogger(StatementExample.class.getName());

        // JDBC 连接的 URL
        String jdbcUrl = "jdbc:mysql://localhost:3306/world";
        String username = "root";
        String password = "1234";

        // 1. 加载 mysql 驱动 (这里省略了手动加载驱动的步骤，JDBC 4.0+ 会自动加载)
        // Class.forName("com.mysql.cj.jdbc.Driver");


        // try() 内放入需要关闭的资源
        try (
                // 2. 建立数据库连接
                Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

                // 3. 创建 Statement 对象，用于执行无参 sql 语句
                Statement statement = connection.createStatement();

                // 4. 执行 SQL 查询,这个是小括号里面不用分号最后
                ResultSet resultSet = statement.executeQuery("SELECT * FROM City")) {

            // 6. 查询处理结果
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("Name");
                String countryCode = resultSet.getString("CountryCode");
                // 7. 其他处理方式

                // 打印信息
                System.out.printf("ID: %d Name: %s CountryCode: %s%n%n", id, name, countryCode);

            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "发生异常", e);
        }
    }
}
