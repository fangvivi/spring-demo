package com.wayne.spring;

import com.wayne.spring.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wayne
 */
class TestXmlPlainBeanInjection {

    /**
     * 1、测试setter注入bean
     * 2、测试构造器注入bean
     */
    @ParameterizedTest
    @ValueSource(strings = {"userService","userService"})
    void testSetterRefInjection(String userServiceId){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:special-bean-injection.xml");
        final UserService userService = ctx.getBean(userServiceId, UserService.class);
        Assertions.assertNotNull(userService);
        userService.addUser();
    }

}
