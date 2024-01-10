package com.huajiaoye.jdbc;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CityMapper {
    @Select("SELECT * FROM city WHERE id=#{id}")
    City getCityById(@Param("id") int id);
    // 一条语句对应一个方法，返回的数据库数据对应 City 对象
}
