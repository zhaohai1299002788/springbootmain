package com.example.springbootapi.redis;

import java.io.Serializable;

/**
 * @Author: 海仔
 * @Date: 2018/9/29 0029 21:10
 * @Version 1.0
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 4842288075159893033L;
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
