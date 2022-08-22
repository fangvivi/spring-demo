package com.wayne.spring;

import com.wayne.spring.pojo.Emp;
import com.wayne.spring.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wayne
 * @date 2022-08-11 22:14
 */
@Slf4j
class TestXmlPlainValueInjection {

    /**
     * 测试setter注入
     * 1、注入普通的属性值
     * 2、使用p命名空间，简化写法
     * 3、注入特殊符号
     */
    @ParameterizedTest
    @ValueSource(strings = {"user","p_user","user_special_character"})
    void testSetterInjection(String userId){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:value-injection.xml");
        final User user = ctx.getBean(userId, User.class);
        log.info("{}", user);
        Assertions.assertNotNull(user);
    }

    /**
     * 测试有参构造器注入
     * 1、注入普通的属性值
     * 2、使用c命名空间，简化写法
     * 3、注入特殊符号
     */
    @ParameterizedTest
    @ValueSource(strings = {"emp","c_emp","emp_special_character"})
    void testConstructorInjection(String empId){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:value-injection.xml");
        final Emp emp = ctx.getBean(empId, Emp.class);
        log.info("{}", emp);
        Assertions.assertNotNull(emp);
    }
}
