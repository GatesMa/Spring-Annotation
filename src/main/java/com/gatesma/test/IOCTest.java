package com.gatesma.test;


import com.gatesma.config.MainConfig;
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
    @SuppressWarnings("resource")
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name : names) {
            System.out.println(name);
        }
    }
    
}