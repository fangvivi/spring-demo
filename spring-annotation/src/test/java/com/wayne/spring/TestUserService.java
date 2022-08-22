package com.wayne.spring;

import com.wayne.spring.config.MyConfig;
import com.wayne.spring.autowired.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wayne
 */
class TestUserService {

    @Test
    void testUserServiceAddXml() {
        final ClassPathXmlApplicationContext ctx
                = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        final UserService userService = ctx.getBean("userService", UserService.class);
        Assertions.assertNotNull(userService);
        userService.add();
    }

    @Test
    void testUserServiceAddAnnotation() {
        final AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(MyConfig.class);
        final UserService userService = ctx.getBean("userService", UserService.class);
        Assertions.assertNotNull(userService);
        userService.add();
    }
}
