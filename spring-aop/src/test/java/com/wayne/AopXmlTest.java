package com.wayne;

import com.wayne.aop.xml.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author wayne
 */
@SpringJUnitConfig(locations = "classpath:aop-config.xml")
class AopXmlTest {

    @Autowired
    private Book book;

    /**
     * 测试xml配置aop
     */
    @Test
    void buyBookTest(){
        Assertions.assertNotNull(book);
        book.buy();
    }
}
