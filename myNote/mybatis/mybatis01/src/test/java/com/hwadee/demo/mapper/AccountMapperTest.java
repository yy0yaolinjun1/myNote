package com.hwadee.demo.mapper;

import com.hwadee.demo.model.Account;
import org.apache.ibatis.io.Resources;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.*;

public class AccountMapperTest {

    private static SqlSessionFactory sqlSessionFactory;
    private SqlSession session;

    @BeforeClass
    public static void beforeClass(){
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }catch (Exception e ){
            e.printStackTrace();
        }
    }
    @Before
    public void before(){
        session = sqlSessionFactory.openSession();
    }

    @After
    public void after(){
        session.close();
    }

    @Test
    public void testFindById(){
        AccountMapper accountMapper = session.getMapper(AccountMapper.class);

        Account account = accountMapper.findById(1);

        Assert.assertNotNull( account );

        System.out.println( account );
    }
}
