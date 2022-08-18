package com.wayne.spring;

import com.wayne.spring.pojo.Book;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试bean的scope
 * @author wayne
 */
@Slf4j
class TestXmlBeanScope {

    /**
     * 从下面的日志可以看出来，单例bean在加载bean的定义信息时就会被创建出来
     * Prototype的bean在实际获取bean的时候才会被创建
     * ***************************************************************************************
     *  - Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@2ea6137
     *  - Loaded 3 bean definitions from class path resource [collection-util-injection.xml]
     *  - Creating shared instance of singleton bean 'bookList'
     *  - Creating shared instance of singleton bean 'books'
     *  - 对象被创建了
     *  - bean定义信息加载完毕
     *  - books-【1648001170】 books1-【1648001170】
     *  - 对象被创建了
     *  - 对象被创建了
     *  - books2-【1995250556】, books3-【301749835】
     */
    @Test
    void testCollectionInjection(){
        ApplicationContext ctx
                = new ClassPathXmlApplicationContext("classpath:collection-util-injection.xml");
        log.info("bean定义信息加载完毕");
        final Book books = ctx.getBean("books", Book.class);
        final Book books1 = ctx.getBean("books", Book.class);
        Assertions.assertNotNull(books);
        Assertions.assertNotNull(books1);
        // 默认情况下，bean的scope是单例的，同一个bean的定义信息获取多少次，得到的都是同一个Bean
        log.info("books-【{}】 books1-【{}】", books.hashCode(), books1.hashCode());
        Assertions.assertEquals(books, books1);

        final Book books2 = ctx.getBean("booksPrototype", Book.class);
        final Book books3 = ctx.getBean("booksPrototype", Book.class);
        Assertions.assertNotNull(books2);
        Assertions.assertNotNull(books3);
        log.info("books2-【{}】, books3-【{}】", books2.hashCode(), books3.hashCode());
        // 如果scope指定为Prototype，那么每次获取的bean都是新创建的
        Assertions.assertNotEquals(books2, books3);
    }
}
