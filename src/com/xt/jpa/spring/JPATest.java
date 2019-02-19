package com.xt.jpa.spring;

import com.xt.jpa.spring.entity.Person;
import com.xt.jpa.spring.service.PersonService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.persistence.Table;
import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author xt
 * @date 2019/2/17 - 16:32
 * @description
 */
public class JPATest {
    private ApplicationContext ctx = null;
    private PersonService personService = null;

    {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        personService = ctx.getBean(PersonService.class);
    }

    @Test
    public void testPersonService() {
        Person p1 = new Person();
        p1.setLastName("aa");
        p1.setEmail("aa@163.com");
        p1.setAge(11);

        Person p2 = new Person();
        p2.setLastName("bb");
        p2.setEmail("bb@163.com");
        p2.setAge(12);

        personService.savePersons(p1, p2);
    }

    @Test
    public void testDataSource() throws SQLException {
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource.getConnection());
    }
}
