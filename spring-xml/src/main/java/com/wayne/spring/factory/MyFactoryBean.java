package com.wayne.spring.factory;

import com.wayne.spring.pojo.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * 声明工厂bean要实现FactoryBean接口
 * 使用spring容器获取的bean类型是getObject()的返回类型
 * @author wayne
 */
public class MyFactoryBean implements FactoryBean<Course> {

    @Override
    public Course getObject(){
        Course course = new Course();
        course.setCourseName("高等数学");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
