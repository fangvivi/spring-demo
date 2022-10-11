package com.wayne.springboot.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author wayne
 */
@Data
@ToString
@NoArgsConstructor
public class User {
    private String name;
    private int age;
    private Pet pet;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
