package com.wayne.spring;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wayne
 */
@Slf4j
class TestOutPropertiesFile {

    @Test
    void testProperties() {
        final ClassPathXmlApplicationContext ctx
                = new ClassPathXmlApplicationContext("classpath:outer-properties-file.xml");
        // 测试通过外部属性文件给bean注入值
        final DruidDataSource datasource = ctx.getBean("datasource", DruidDataSource.class);
        Assertions.assertNotNull(datasource);
        log.info("{}", datasource);
    }

}
