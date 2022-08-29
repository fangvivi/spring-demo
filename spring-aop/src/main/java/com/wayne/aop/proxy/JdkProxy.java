package com.wayne.aop.proxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wayne
 */
@Slf4j
public class JdkProxy {
    public static void main(String[] args) {
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        final ClassLoader classLoader = userDaoImpl.getClass().getClassLoader();
        final Class<?>[] interfaces = userDaoImpl.getClass().getInterfaces();
        UserDaoProxy userDaoProxy = new UserDaoProxy(userDaoImpl);
        final UserDao userDao = (UserDao)Proxy.newProxyInstance(classLoader, interfaces, userDaoProxy);
        Object obj = userDao.add(1,2);
        log.info("{}", obj);
    }
}

@Slf4j
class UserDaoProxy implements InvocationHandler{
    /**
     * 被代理的对象
     */
    private final Object target;

    public UserDaoProxy(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("执行方法之前。。。");
        // 执行被代理对象的方法
        final Object result = method.invoke(target, args);
        log.info("执行方法之后。。。");
        return result;
    }
}
