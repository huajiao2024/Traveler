package com.huajiaoye.jdbc;

import com.mysql.cj.jdbc.Driver;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCVersion {
    private static final Logger logger = Logger.getLogger(JDBCVersion.class.getName());

    public static void main(String[] args) {
        try {
            // 获取 JDBC 驱动
            Driver driver = new com.mysql.cj.jdbc.Driver();

            // 获取 JDBC 版本信息
            int majorVersion = driver.getMajorVersion();
            int minorVersion = driver.getMinorVersion();

            System.out.println("JDBC 版本: " + majorVersion + "." + minorVersion);
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "发生异常", e);
        }
    }
}
