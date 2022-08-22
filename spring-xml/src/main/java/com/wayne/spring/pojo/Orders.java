package com.wayne.spring.pojo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 展示bean的生命周期
 * @author wayne
 */
@Slf4j
public class Orders {
    private String name;
    public Orders(){
      log.info("第一步：执行无参构造");
    }

    public void setName(String name) {
        this.name = name;
        log.info("第二步：执行set方法");
    }

    public void init(){
        log.info("第三步：执行init方法");
    }

    public void destroy(){
        log.info("第五步：执行destroy方法");
    }

}
