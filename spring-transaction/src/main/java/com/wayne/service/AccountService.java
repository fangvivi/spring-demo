package com.wayne.service;

import com.wayne.dao.UserDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

/**
 * @author wayne
 */
@Service
@Transactional(rollbackFor = Exception.class)
@Slf4j
public class AccountService {
    @Autowired
    private UserDao userDao;

    public void accountMoney() {
        /*
        被try catch包围的逻辑，aop无法进行回滚
        解决方法：1、在 catch 中重新抛出异常
                2、在 catch 中手动回滚事务
         */
        try{
            userDao.reduceMoney();
            // 手动抛出异常
            int i = 1 / 0 ;
            userDao.addMoney();
        } catch (Exception e){
            log.error("message{}", e.getMessage());
            // 手动回滚
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
    }
}
