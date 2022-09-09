package com.wayne;

import com.wayne.aop.annotation.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author wayne
 */
@SpringJUnitConfig(locations = "classpath:aop-config.xml")
class AopTest {

    @Autowired
    private User user;

    @Test
    void testAopAnnotation(){
        Assertions.assertNotNull(user);
        user.add();
    }

}
