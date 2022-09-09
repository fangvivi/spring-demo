package com.wayne.aop.annotation;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author wayne
 */
@Component
@Aspect
@Slf4j
public class UserProxy {


    /**
     * 公共切入点
     */
    @Pointcut("execution(* com.wayne.aop.annotation.User.add(..))")
    public void pointcut(){
    //  抽取公共的切入点，方便复用
    }
    @Before(value = "pointcut()")
    public void before(){
        log.info("before...");
    }

    @After("execution(* com.wayne.aop.annotation.User.add(..))")
    public void after(){
        log.info("after...");
    }

    @AfterReturning("execution(* com.wayne.aop.annotation.User.add(..))")
    public void afterReturn(){
        log.info("afterReturn");
    }

    @Around(value = "execution(* com.wayne.aop.annotation.User.add(..))")
    public void around(ProceedingJoinPoint point) throws Throwable {
        log.info("around before");
        point.proceed();
        log.info("around after");
    }

    @AfterThrowing(value = "execution(* com.wayne.aop.annotation.User.add(..))")
    public void afterThrowing(){
        log.info("AfterThrowing");
    }
}
