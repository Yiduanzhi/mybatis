package com.mao.dao;

import com.mao.pojo.user;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;
//用注解开发注意 一定不能有xml的痕迹 如果有了就得删掉 比如usermapper.xml
public interface UserMapper {
  //  @Select("select * from user")
    List<user> getUserList();
    //根据id查询用户
    user getUserById(int id);
    //insert一个用户
    int addUser(user user);
    //分页
    List<user> getUserByLimit(Map<String,Integer> map);
}
