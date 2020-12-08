package mao.dao;

import mao.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //查询所有学生信息以及对应老师信息
    public List<Student> getStudent();
    public List<Student> getStudent2();
}
