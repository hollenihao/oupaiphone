package com.nf.njh;

import com.nf.njh.config.AppConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;


public class test {
    @Test
    public void jdbctest() throws SQLException {
        ApplicationContext context = new AnnotationConfigApplicationContext
                (AppConfig.class);
        DataSource dataSource = context.getBean(DataSource.class);

        System.out.println( dataSource.getConnection());
    }
}
