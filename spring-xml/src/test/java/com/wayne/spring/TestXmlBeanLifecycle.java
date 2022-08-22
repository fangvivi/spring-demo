package com.wayne.spring;

import com.wayne.spring.pojo.Orders;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wayne
 */
@Slf4j
class TestXmlBeanLifecycle {

    @Test
    void testBeanLifecycle(){
        ClassPathXmlApplicationContext ctx
                = new ClassPathXmlApplicationContext("classpath:bean-lifecycle.xml");
        final Orders order = ctx.getBean("order", Orders.class);
        log.info("第四步：获取bean对象");
        Assertions.assertNotNull(order);
        // 手动关闭容器，让bean的销毁方法执行
        ctx.close();
    }
}
