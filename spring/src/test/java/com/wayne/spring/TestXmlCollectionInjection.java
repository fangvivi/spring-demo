package com.wayne.spring;

import com.wayne.spring.pojo.GoodStudent;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wayne
 */
@Slf4j
class TestXmlCollectionInjection {
    /**
     * 测试注入集合属性
     */
    @Test
    void testCollectionInjection(){
        ApplicationContext ctx
                = new ClassPathXmlApplicationContext("classpath:collection-injection.xml");
        final GoodStudent goodStudent = ctx.getBean("goodStudent", GoodStudent.class);
        Assertions.assertNotNull(goodStudent);
        Assertions.assertNotEquals(0, goodStudent.getCourseList().size());
        log.info("{}", goodStudent);

    }
}
