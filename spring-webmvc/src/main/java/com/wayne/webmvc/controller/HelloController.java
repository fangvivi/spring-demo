package com.wayne.webmvc.controller;

import com.wayne.webmvc.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wayne
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public Employee hello(){
        return new Employee(9527,"张三");
    }
}
