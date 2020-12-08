import com.mao.dao.BlogMapper;
import com.mao.pojo.Blog;
import com.mao.utils.IDUtils;
import com.mao.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class mytest {
    @Test
    public void addInitBlog(){
        SqlSession session= MyBatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Blog blog=new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("mybatis如此简单");
        blog.setAuthor("猫哥");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("java如此简单");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Spring如此简单");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("微服务如此简单");
        mapper.addBlog(blog);

        session.close();
    }

    @Test
    public void queryBlogIF(){
        SqlSession sqlSession= MyBatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map=new HashMap();
        map.put("title","java如此简单");//如果不加就都查出来了
//        List<Blog> blogs = mapper.queryBlogIF(map);
        List<Blog> blogs = mapper.queryBlogChoose(map);//and可以不加了 反正只选一个 也可以不用where标签
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
