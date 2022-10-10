package com.wayne.aop.annotation;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author wayne
 */
@Component
@Aspect
@Order(1) // 设置同一个方法的切点的优先级，数值越小，优先级越高
@Slf4j
public class PersonProxy {
    @After(value = "com.wayne.aop.annotation.ConfigAop.pointcut()")
    public void after(){
        log.info("PersonProxy 增强 User.add()，after");
    }
}
