package com.wayne.spring;

import com.wayne.spring.autowired.Master;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wayne
 */
class TestXmlAutowire {

    @Test
    void testAutowire(){
        final ClassPathXmlApplicationContext ctx
                = new ClassPathXmlApplicationContext("classpath:autowire.xml");
        // 根据类型自动注入
        final Master master = ctx.getBean("pet_master", Master.class);
        // 根据属性名称自动注入
        final Master master1 = ctx.getBean("pet_master1", Master.class);
        Assertions.assertNotNull(master.getPet());
        Assertions.assertNotNull(master1.getPet());
    }
}
