package com.wayne.spring.dao;

import lombok.extern.slf4j.Slf4j;

/**
 * @author wayne
 */
@Slf4j
public class UserDaoImpl implements UserDao{
    @Override
    public void useradd() {
        log.info("userDao add...");
    }
}
