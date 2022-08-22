package com.wayne.spring;

import com.wayne.spring.pojo.Book;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wayne
 */
@Slf4j
class TestXmlUtilCollectionInjection {
    /**
     * 测试util命名空间注入集合属性
     */
    @Test
    void testCollectionInjection(){
        ApplicationContext ctx
                = new ClassPathXmlApplicationContext("classpath:collection-util-injection.xml");
        final Book books = ctx.getBean("books", Book.class);
        Assertions.assertNotNull(books);
        books.showBooks();
    }
}
