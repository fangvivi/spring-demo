package com.wayne.aop.annotation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author wayne
 */
@Component
@Slf4j
public class User {
    public void add() {
        //int a = 1/0;
        log.info("add.......");
    }
}
