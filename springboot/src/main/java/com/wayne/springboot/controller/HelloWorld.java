package com.wayne.springboot.controller;

import com.wayne.springboot.pojo.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wayne
 */
@RestController
@Slf4j
public class HelloWorld {
    @Autowired
    private Person person;

    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }

    @RequestMapping("/person")
    public Person person(){
        log.info("{}", person);
        return person;
    }
}
