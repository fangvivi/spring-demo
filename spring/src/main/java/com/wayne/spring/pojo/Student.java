package com.wayne.spring.pojo;

import lombok.ToString;

/**
 * @author wayne
 */
@ToString
public class Student {
    private String name;
    private String gender;
    private Grade grade;

    public Student(String name, String gender, Grade grade) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Grade getGrade() {
        return grade;
    }
}
