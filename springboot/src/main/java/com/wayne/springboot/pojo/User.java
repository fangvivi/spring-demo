package com.wayne.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author wayne
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private int age;
    private Pet pet;
}
