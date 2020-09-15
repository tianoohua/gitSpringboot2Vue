package com.example.demo2;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;

@RunWith(SpringRunner.class)
@SpringBootTest
class Demo2ApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws Exception{
        System.out.println(dataSource.getClass());
//        系统默认数据源
//        class com.zaxxer.hikari.HikariDataSource

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
//        HikariProxyConnection@606826010 wrapping com.mysql.cj.jdbc.ConnectionImpl@39a87e72
        connection.close();
    }

}
