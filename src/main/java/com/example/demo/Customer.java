package com.example.demo;

import javax.naming.Context;
import java.time.LocalDate;
import java.util.Map;

public class Customer {
    private String name;
    private String index;
    private LocalDate bDate;
    private int course;
    private Context context;
    private String password;
    private Map<String, Integer> subjects;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public LocalDate getbDate() {
        return bDate;
    }

    public void setbDate(LocalDate bDate) {
        this.bDate = bDate;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public Map<String, Integer> getSubjects() {
        return subjects;
    }

    public void setSubjects(Map<String, Integer> subjects) {
        this.subjects = subjects;
    }
}
