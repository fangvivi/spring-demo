package com.wayne.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author wayne
 */
@Component
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties("person")
public class Person {
    private String name;
    private int age;
    private Date birthday;
    private Pet pet;
    private String[] hobbies;
    private List<String> subjects;
    private Map<String, Double> score;
    private Set<String> runResult;
    private Map<String, List<Pet>> allPet;
}
