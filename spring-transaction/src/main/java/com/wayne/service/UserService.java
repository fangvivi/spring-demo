package com.wayne.service;

import com.wayne.dao.UserDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wayne
 */
@Service
@Transactional(rollbackFor = ArithmeticException.class)
@Slf4j
public class UserService {
    @Autowired
    private UserDao userDao;

    public void accountMoney(){

        try {
            userDao.reduceMoney();
            int i = 1 / 0 ;
            userDao.addMoney();
        } catch (Exception e){
            log.error("{}", e.getMessage(), e);
        }

    }
}
