package com.wayne;

import com.wayne.aop.annotation.ConfigAop;
import com.wayne.aop.annotation.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author wayne
 */
@SpringJUnitConfig(classes = {ConfigAop.class})
class AopAnnotationTest {

    @Autowired
    private User user;

    /**
     * 测试注解配置aop
     */
    @Test
    void testAopAnnotation(){
        Assertions.assertNotNull(user);
        user.add();
    }

}
