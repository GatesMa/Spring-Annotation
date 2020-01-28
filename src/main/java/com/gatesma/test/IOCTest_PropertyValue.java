package com.gatesma.test;

import com.gatesma.bean.Person;
import com.gatesma.config.MainConfigOfPropertyValues;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Copyright (C), 2020
 * FileName: IOCTest_PropertyValue
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/28 11:52
 * Description:
 */
public class IOCTest_PropertyValue {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);


    @Test
    public void test01() {

        printBeans(applicationContext);
        System.out.println("================");
        Person person =(Person) applicationContext.getBean("person");
        System.out.println(person);


        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("person.nickName");
        System.out.println(property);

        applicationContext.close();

    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext) {
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name : names) {
            System.out.println(name);
        }
    }

}
