package com.wayne.aop.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author wayne
 */
@Slf4j
public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        log.info("add方法执行了...");
        return a+b;
    }

    @Override
    public String update(String id) {
        log.info("update方法执行了...");
        return id;
    }
}
