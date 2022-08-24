package com.wayne.spring.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author wayne
 */
@Component
public class Student {

    /**
     * 两个注解搭配使用可以实现名称注入
     * qualifier value的默认值是bean名称
     */
    @Autowired
    @Qualifier("sixthGrade")
    private SixthGrade grade;

    public SixthGrade getGrade() {
        return grade;
    }
}
