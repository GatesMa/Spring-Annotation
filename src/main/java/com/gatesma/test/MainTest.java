package com.gatesma.test;

import com.gatesma.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright (C), 2020
 * FileName: MainTest
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/22 20:36
 * Description:
 */
public class MainTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person );
    }

}
