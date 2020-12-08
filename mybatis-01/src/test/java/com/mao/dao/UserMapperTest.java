package com.mao.dao;

import com.mao.pojo.user;
import com.mao.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserMapperTest {
    @Test
    public void test() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<user> userList = userMapper.getUserList();
        for (user user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        user userById = mapper.getUserById(1);
        System.out.println(userById);
        sqlSession.close();
    }

//    @Test
//    public void addUser() {
//        SqlSession sqlSession = MyBatisUtils.getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        mapper.addUser(new user(5, "wdm", "123"));
//        //注意事务提交(增删改）！
//        sqlSession.commit();
//        sqlSession.close();
//    }
//
//    @Test
//    public void getUserByLimit() {
//        SqlSession sqlSession = MyBatisUtils.getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("startIndex", 0);
//        map.put("pageSize", 2);
//        List<user> userByLimit = mapper.getUserByLimit(map);
//        for (user user : userByLimit) {
//            System.out.println(user);
//        }
//        sqlSession.close();
//    }
}