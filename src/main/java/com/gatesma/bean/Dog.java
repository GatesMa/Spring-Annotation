package com.gatesma.bean;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
/**
 * Copyright (C), 2020
 * FileName: Dog
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/27 11:07
 * Description:
 */
@Component
public class Dog implements ApplicationContextAware {

    

    public Dog() {
        System.out.println("Dog Constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("Dog. @PostConstruct");
    }

    @PreDestroy
    public void destory() {
        System.out.println("Dog. @PreDestory");
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext);
    }
}
