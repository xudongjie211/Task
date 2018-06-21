package com.dao;

import com.pojo.Customer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CustomerDao {
    //查询用户登录信息是否匹配
    @Select("select * from user where username=#{username} and password=#{password}")
    Customer checkCustomer(@Param("username") String username, @Param("password") String password) throws Exception;

    //查询用户是否已存在
    @Select("select * from user where username=#{username}")
    Customer findCustomer(String username) throws Exception;

    //新增注册用户的信息
    @Insert("insert into user (id,username,password,age,birthday,salt) values (#{id},#{username},#{password},#{age},#{birthday},#{salt})")
    @Options(useGeneratedKeys = true, keyColumn = "id")
    int insertCustomer(Customer customer) throws Exception;
}
