package com.wayne.spring.resource;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author wayne
 */
@Component
public class Emp {
    /**
     * 先根据名称注入，没有的话，再根据类型注入
     */
    @Resource
    private Dept dept;
}
