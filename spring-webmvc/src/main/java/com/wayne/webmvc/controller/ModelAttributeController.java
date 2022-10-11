package com.wayne.webmvc.controller;

import com.wayne.webmvc.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wayne
 */
@Controller
@ControllerAdvice
public class ModelAttributeController {

    private final Map<Long, Employee> employeeMap = new HashMap<>();
    @ModelAttribute
    public void addAttributes(Model model){
        model.addAttribute("msg","hello world!");
    }

    @PostMapping(value = "/addEmployee")
    public String submit(
            @ModelAttribute("employee")Employee employee,
            BindingResult result, ModelMap model){
        if(result.hasErrors()){
            return "error";
        }
        model.addAttribute("name", employee.getName());
        model.addAttribute("id",employee.getId());
        employeeMap.put(employee.getId(), employee);
        return "employeeView";
    }

    @GetMapping(value = "/form")
    public String getForm(){
        return "submit";
    }
}
