package com.wayne.spring;

import com.wayne.spring.pojo.Student;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wayne
 */
@Slf4j
class TestXmlSpecialBeanInjection {

    /**
     * 1、测试bean标签内部嵌套bean标签，实现setter注入
     * 2、测试级联属性，实现setter注入
     * 3、测试bean标签内部嵌套bean标签，实现构造注入
     */
    @ParameterizedTest
    @ValueSource(strings = {"student","student1","student2"})
    void testSetterRefInjection(String beanId){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:special-bean-injection.xml");
        final Student student = ctx.getBean(beanId, Student.class);
        Assertions.assertNotNull(student);
        log.info("{}", student);
    }

}
