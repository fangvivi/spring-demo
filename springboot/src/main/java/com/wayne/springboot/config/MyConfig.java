package com.wayne.springboot.config;

import com.wayne.springboot.pojo.Pet;
import com.wayne.springboot.pojo.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wayne
 */
@Configuration
public class MyConfig {

    @Bean("tom")
    public Pet getPet(){
        return new Pet("tom");
    }

    @Bean("user")
    @ConditionalOnBean(name="tom")
    public User getUser(){
        return new User("张三",25);
    }
}
