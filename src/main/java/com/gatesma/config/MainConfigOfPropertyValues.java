package com.gatesma.config;

import com.gatesma.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Copyright (C), 2020
 * FileName: MainConfigOfPropertyValues
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/28 11:51
 * Description:
 */

//使用@PropertySource读取外部配置文件中的k/v保存到运行的环境变量中;加载完外部的配置文件以后使用${}取出配置文件的值
@PropertySource(value={"classpath:/person.properties"})
@Configuration
public class MainConfigOfPropertyValues {


    @Bean
    public Person person() {
        return new Person();
    }

}
