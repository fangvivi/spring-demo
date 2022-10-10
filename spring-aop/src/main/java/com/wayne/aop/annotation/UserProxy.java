package com.wayne.aop.annotation;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author wayne
 */
@Component
@Aspect
@Slf4j
@Order(2)
public class UserProxy {

    @Before(value = "com.wayne.aop.annotation.ConfigAop.pointcut()")
    public void before(){
        log.info("UserProxy 增强 User.add()，before...");
    }

    @After("execution(* com.wayne.aop.annotation.User.add(..))")
    public void after(){
        log.info("UserProxy 增强 User.add()，after...");
    }

    @AfterReturning("execution(* com.wayne.aop.annotation.User.add(..))")
    public void afterReturn(){
        log.info("UserProxy 增强 User.add()，afterReturn");
    }

    @Around(value = "execution(* com.wayne.aop.annotation.User.add(..))")
    public void around(ProceedingJoinPoint point) throws Throwable {
        log.info("UserProxy 增强 User.add()，around before");
        point.proceed();
        log.info("UserProxy 增强 User.add()，around after");
    }

    @AfterThrowing(value = "execution(* com.wayne.aop.annotation.User.add(..))")
    public void afterThrowing(){
        log.info("UserProxy 增强 User.add()，AfterThrowing");
    }
}
