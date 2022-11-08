package com.wayne.spring.config;

import com.wayne.spring.autowired.UserDao;
import com.wayne.spring.autowired.UserDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author wayne
 */
@Configuration
@ComponentScan(basePackages = {"com.wayne.spring"})
public class MyConfig {
    @Bean("userDao")
    public UserDao userDao(){
        return new UserDaoImpl();
    }

}
