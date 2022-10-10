package com.wayne;

import com.wayne.config.TxConfig;
import com.wayne.service.AccountService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author wayne
 */
@SpringJUnitConfig(classes = TxConfig.class)
class AccountServiceAnnotationTest {

    @Autowired
    private AccountService accountService;
    @Test
    void accountMoneyTest(){
        Assertions.assertNotNull(accountService);
        accountService.accountMoney();
    }

}
