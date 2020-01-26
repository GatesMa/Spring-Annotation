package com.gatesma.test;


import com.gatesma.bean.Person;
import com.gatesma.config.MainConfig;
import com.gatesma.config.MainConfig2;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * Copyright (C), 2020
 * FileName: IOCTest
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/23 16:22
 * Description:
 */
public class IOCTest {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);


    @Test
    public void testImport() {
        printBeans(applicationContext);
    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext) {
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name : names) {
            System.out.println(name);
        }
    }
    
    @Test
    public void test03()     {
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);

//        String[] names = applicationContext.getBeanNamesForType(Person.class);
//        for(String name : names) {
//            System.out.println(name);
//        }

        Map<String, Person> beans = applicationContext.getBeansOfType(Person.class);
        for(Map.Entry<String, Person> entry : beans.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }



    @Test
    public void test02() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] names = applicationContext.getBeanDefinitionNames();
//        for(String name : names) {
//            System.out.println(name);
//        }
//        Object bean = applicationContext.getBean("person");
//        Object bean2 = applicationContext.getBean("person");
//        System.out.println(bean == bean2);
    }

    @Test
    @SuppressWarnings("resource")
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name : names) {
            System.out.println(name);
        }
    }
    
}
