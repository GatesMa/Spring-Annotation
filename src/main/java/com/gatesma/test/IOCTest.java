package com.gatesma.test;


import com.gatesma.config.MainConfig;
import com.gatesma.config.MainConfig2;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Copyright (C), 2020
 * FileName: IOCTest
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/23 16:22
 * Description:
 */
public class IOCTest {

    @Test
    public void test02() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name : names) {
            System.out.println(name);
        }
        Object bean = applicationContext.getBean("person");
        Object bean2 = applicationContext.getBean("person");
        System.out.println(bean == bean2);
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
