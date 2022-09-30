package com.wayne.springboot;

import com.wayne.springboot.pojo.Person;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author wayne
 */
@SpringBootTest
@Slf4j
class YamlTest {
    @Autowired
    private Person person;
    @Test
    void testYaml(){
        Assertions.assertNotNull(person);
        log.info("person: {}", person);
    }
}
