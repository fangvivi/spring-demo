package com.wayne.spring.resource;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author wayne
 */
@Component
public class Emp {
    /**
     * 注解@Resource根据
     *   1. Match by Name
     *   2. Match by Type
     *   3. Match by Qualifier
     */
    @Resource
    private Dept dept;
}
