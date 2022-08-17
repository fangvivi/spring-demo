package com.wayne.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wayne
 */
@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }
}
