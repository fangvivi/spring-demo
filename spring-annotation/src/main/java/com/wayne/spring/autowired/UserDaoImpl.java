package com.wayne.spring.autowired;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author wayne
 */
@Service
@Slf4j
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        log.info("userDao add......");
    }
}
