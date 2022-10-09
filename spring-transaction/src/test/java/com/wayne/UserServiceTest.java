package com.wayne;

import com.wayne.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author wayne
 */
@SpringJUnitConfig(locations = "classpath:spring-jdbc.xml")
class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    void accountMoneyTest(){
        userService.accountMoney();
    }

}
