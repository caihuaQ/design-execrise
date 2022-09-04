package design.test.tutorials_19_0_2;

import com.alibaba.fastjson.JSON;
import design.tutorials_18_0_0.group.Employee;
import design.tutorials_18_0_0.group.GroupStructure;
import design.tutorials_18_0_0.group.Link;
import design.tutorials_18_0_0.lang.Iterator;
import design.tutorials_19_0_2.mediator.SqlSession;
import design.tutorials_19_0_2.mediator.SqlSessionFactory;
import design.tutorials_19_0_2.mediator.SqlSessionFactoryBuilder;
import design.tutorials_19_0_2.po.User;
import org.apache.ibatis.io.Resources;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Reader;
import java.util.List;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_queryUserInfoById() {
        String resource = "mybatis-config-datasource.xml";
        Reader reader;
        try {
            reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);

            SqlSession session = sqlMapper.openSession();
            try {
                User user = session.selectOne("design.tutorials_19_0_2.dao.IUserDao.queryUserInfoById", 1L);
                logger.info("测试结果：{}", JSON.toJSONString(user));
            } finally {
                session.close();
                reader.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test_queryUserList() {
        String resource = "mybatis-config-datasource.xml";
        Reader reader;
        try {
            reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);

            SqlSession session = sqlMapper.openSession();
            try {
                User req = new User();
                req.setAge(18);
                List<User> userList = session.selectList("design.tutorials_19_0_2.dao.IUserDao.queryUserList", req);
                logger.info("测试结果：{}", JSON.toJSONString(userList));
            } finally {
                session.close();
                reader.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
