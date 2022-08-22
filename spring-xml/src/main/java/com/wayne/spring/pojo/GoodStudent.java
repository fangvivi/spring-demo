package com.wayne.spring.pojo;

import lombok.ToString;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author wayne
 */
@ToString
public class GoodStudent {
    /** 数组 */
    private String[] courses;
    /** list */
    private List<String> list;
    /** map */
    private Map<String, String> maps;
    /** set */
    private Set<String> sets;
    /** 课程集合 */
    private List<Course> courseList;

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }
}
