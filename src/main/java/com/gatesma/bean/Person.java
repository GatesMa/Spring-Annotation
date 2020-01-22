package com.gatesma.bean;

/**
 * Copyright (C), 2020
 * FileName: Person
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/22 20:25
 * Description:
 */
public class Person  {

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

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
