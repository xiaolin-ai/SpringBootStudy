package org.example.dao;


import org.apache.ibatis.annotations.*;
import org.example.pojo.Guest;

import java.util.List;

/**
 * @Author: aixiaolin
 * @Date: 2020-04-27 0:39
 * @Description: Mapper注解等价于Spring的@component注解，
 * 是将mapper接口的实例化对象加入容器，mapper接口过多时可以在启动类加入@MapperScan注解
 * 也能对dao层进行扫描
 */
//@Mapper
public interface GuestMapper {

    List<Guest> allGuest();


    @Delete("DELETE FROM guest WHERE NAME = #{name}")
    int delete(String name);

    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    @Insert("INSERT INTO guest (name, role) VALUES (#{name}, #{role})")
    int insert(Guest guest);


    @Update("UPDATE guest SET role = #{role} WHERE name = #{name}")
    int update(Guest guest);

    @Select("SELECT name, role FROM guest WHERE name = #{name}")
    Guest oneGuest(String name);


}
