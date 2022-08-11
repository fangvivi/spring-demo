package com.wayne.spring;

import com.wayne.spring.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wayne
 * @date 2022-08-11 22:14
 */
@Slf4j
public class DemoTest {

    @Test
    public void testAdd(){
        ApplicationContext ctx
                = new ClassPathXmlApplicationContext("classpath:beans.xml");
        final User user = ctx.getBean("user", User.class);
        log.info("{}", user);
        Assert.assertNotNull(user);
        user.add();

    }
}
