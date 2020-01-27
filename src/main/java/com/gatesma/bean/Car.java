package com.gatesma.bean;

import org.springframework.stereotype.Component;

/**
 * Copyright (C), 2020
 * FileName: Car
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/27 10:48
 * Description:
 */
@Component
public class Car {
    public Car(){
        System.out.println("car constructor...");
    }

    public void init(){
        System.out.println("car ... init...");
    }

    public void detory(){
        System.out.println("car ... detory...");
    }
}
