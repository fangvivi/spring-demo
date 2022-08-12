package com.wayne.spring.pojo;

import lombok.ToString;

/**
 * @author wayne
 */
@ToString
public class Emp {
    private String name;
    private String password;
    private String address;

    public Emp(String name, String password, String address) {
        this.name = name;
        this.password = password;
        this.address = address;
    }

    public Emp(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
