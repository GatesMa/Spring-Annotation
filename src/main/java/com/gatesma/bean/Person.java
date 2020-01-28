package com.gatesma.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * Copyright (C), 2020
 * FileName: Person
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/22 20:25
 * Description:
 */
public class Person  {

    //使用@Value赋值；
    //1、基本数值
    //2、可以写SpEL； #{}
    //3、可以写${}；取出配置文件【properties】中的值（在运行环境变量里面的值）

    @Value("Marlon")
    private String name;

    @Value("#{20-1}")
    private Integer age;

    @Value("${person.nickName}")
    private String nickname;

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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
