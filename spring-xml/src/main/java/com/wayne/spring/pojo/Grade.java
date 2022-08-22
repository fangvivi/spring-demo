package com.wayne.spring.pojo;

import lombok.ToString;

/**
 * @author wayne
 */
@ToString
public class Grade {
    private String className;

    public void setClassName(String className) {
        this.className = className;
    }
}
