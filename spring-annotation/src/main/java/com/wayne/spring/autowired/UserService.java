package com.wayne.spring.autowired;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 注解@Autowired是根据类型注入
 * @author wayne
 */
@Slf4j
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void add(){
        log.info("userService add......");
        userDao.add();
    }
}
