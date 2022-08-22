package com.wayne.spring.service;

import com.wayne.spring.dao.UserDao;
import lombok.extern.slf4j.Slf4j;

/**
 * @author wayne
 */
@Slf4j
public class UserService {
    private UserDao userDao;

    public UserService() {
    }

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void addUser(){
        log.info("userService add....");
        userDao.useradd();
    }
}
