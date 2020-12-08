import mao.dao.StudentMapper;
import mao.dao.TeacherMapper;
import mao.pojo.Student;
import mao.pojo.Teacher;
import mao.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class myTest {
//    public static void main(String[] args) {
//        SqlSession sqlSession = MyBatisUtils.getSqlSession();
//        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
//        Teacher teacher = mapper.getTeacher(1);
//        System.out.println(teacher);
//        sqlSession.close();
//    }
    @Test
    public void testStudent(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent2();
        for (Student student1 : student) {
            System.out.println(student1);
        }
        sqlSession.close();
    }

}
