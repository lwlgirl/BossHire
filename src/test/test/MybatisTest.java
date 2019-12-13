package test;

import com.lwl.bosshire.dao.UserMapper;
import com.lwl.bosshire.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {

    @Test
    public void test() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        UserMapper userMapper = session.getMapper(UserMapper.class);
        try {
            User user = new User();

            // 查询
//                User user = userMapper.selectUser(1);
            // 插入
//                userMapper.insert(user);
//                session.commit();
//                log.info("user;{}",user);
            // 查询所有
//                List<User> users = userMapper.selectAll();
//                for(User u:users){
//                    log.info("user: " + u);
//                }
          //   删除
                userMapper.delete(1);
                session.commit();
            // 修改
//            user.setId(5);
//            user.setName("大王");
//            userMapper.update(user);
//            session.commit();
        }finally {
            session.close();
        }

    }
}

