package com.wayne.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author wayne
 */
@SpringBootApplication
@Slf4j
public class MainApplication {
    public static void main(String[] args) {
        final ApplicationContext context = SpringApplication.run(MainApplication.class, args);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            log.info("beanName--{}", beanDefinitionName);
        }
        log.info("spring容器是否包含user :{}", context.containsBean("user"));
        log.info("spring容器是否包含tom :{}", context.containsBean("tom"));
    }
}
