package com.wayne.spring.pojo;

import lombok.ToString;

/**
 * @author wayne
 */
@ToString
public class Course {
    private String courseName;

    public void setCourseName(String courseName) {

        this.courseName = courseName;
    }
}
