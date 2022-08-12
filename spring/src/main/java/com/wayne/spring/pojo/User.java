package com.wayne.spring.pojo;

import lombok.ToString;

/**
 * @author wayne
 * @date 2022-08-11 22:09
 */
@ToString
public class User {

    private String name;
    private int age;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
