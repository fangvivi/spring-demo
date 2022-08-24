package com.wayne.spring;

import com.wayne.spring.config.MyConfig;
import com.wayne.spring.autowired.UserService;
import com.wayne.spring.qualifier.Student;
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

    /**
     * 使用@Autowired，根据属性类型注入
     */
    @Test
    void testAutowired() {
        final AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(MyConfig.class);
        final UserService userService = ctx.getBean("userService", UserService.class);
        Assertions.assertNotNull(userService);
        userService.add();
    }

    /**
     * 使用@Autowired和Qualifier根据属性名称注入
     */
    @Test
    void testQualifier() {
        final AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(MyConfig.class);
        final Student student = ctx.getBean("student", Student.class);
        Assertions.assertNotNull(student);
        Assertions.assertNotNull(student.getGrade());
    }

    /**
     * 使用@Resource先根据名称注入，没有则根据类型注入
     */
    @Test
    void testResource() {
        final AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(MyConfig.class);
        final Student student = ctx.getBean("student", Student.class);
        Assertions.assertNotNull(student);
        Assertions.assertNotNull(student.getGrade());
    }
}
