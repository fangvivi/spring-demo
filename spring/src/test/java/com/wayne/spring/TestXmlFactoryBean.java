package com.wayne.spring;

import com.wayne.spring.pojo.Course;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wayne
 */
@Slf4j
class TestXmlFactoryBean {

    @Test
    void testFactoryBean(){
        ApplicationContext ctx
                = new ClassPathXmlApplicationContext("classpath:factoryBean.xml");
        // 这里获取的bean类型是工厂bean，getObject()方法的返回值类型
        Course course = ctx.getBean("factoryBean", Course.class);
        Assertions.assertNotNull(course);
        log.info("{}", course);
    }

}
