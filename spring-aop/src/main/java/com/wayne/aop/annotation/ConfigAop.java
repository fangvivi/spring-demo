package com.wayne.aop.annotation;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author wayne
 */
@Configuration
@ComponentScan("com.wayne")
@EnableAspectJAutoProxy(proxyTargetClass = true) // 开启对@Aspect注解的支持
public class ConfigAop {
    /**
     * 公共切入点
     */
    @Pointcut("execution(* com.wayne.aop.annotation.User.add(..))")
    public void pointcut(){
        //  抽取公共的切入点，方便复用
    }
}
