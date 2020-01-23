package com.gatesma.config;

import com.gatesma.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright (C), 2020
 * FileName: MainConfig
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/22 21:00
 * Description:
 */
@Configuration
@ComponentScan(value = "com.gatesma")
public class MainConfig {


    @Bean
    public Person person() {
        return new Person("lishi", 20);
    }


}
