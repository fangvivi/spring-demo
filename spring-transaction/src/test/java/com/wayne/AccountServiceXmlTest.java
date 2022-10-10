package com.wayne;

import com.wayne.service.AccountService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author wayne
 */
@SpringJUnitConfig(locations = "classpath:spring-jdbc.xml")
class AccountServiceXmlTest {
    @Autowired
    private AccountService userService;

    @Test
    void accountMoneyTest(){
        Assertions.assertNotNull(userService);
        userService.accountMoney();
    }

}
