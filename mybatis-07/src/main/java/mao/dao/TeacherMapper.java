package mao.dao;

import mao.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface TeacherMapper {
    //获取老师
//    List<Teacher> getTeacher();

    Teacher getTeacher( int id);
}
