package com.gatesma.config;

import com.gatesma.bean.Person;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * Copyright (C), 2020
 * FileName: MainConfig
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/22 21:00
 * Description:
 */
@Configuration
//@ComponentScan(value = {"com.gatesma"},
////        excludeFilters = {@Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class})},
//        includeFilters = {@Filter(type = FilterType.ANNOTATION, classes = {Controller.class})},
//        useDefaultFilters = false
//)
@ComponentScans(
        value = {
//                @ComponentScan(value="com.gatesma",includeFilters = {
///*						@Filter(type=FilterType.ANNOTATION,classes={Controller.class}),
//						@Filter(type=FilterType.ASSIGNABLE_TYPE,classes={BookService.class}),*/
//                        @Filter(type=FilterType.CUSTOM,classes={MyTypeFilter.class})
//                },useDefaultFilters = false)
                @ComponentScan(value = {"com.gatesma"},
                //        excludeFilters = {@Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class})},
                        includeFilters = {@Filter(type = FilterType.ANNOTATION, classes = {Controller.class})},
                        useDefaultFilters = false
                )
        }
)
//@ComponentScan  value:指定要扫描的包
//excludeFilters = Filter[] ：指定扫描的时候按照什么规则排除那些组件
//includeFilters = Filter[] ：指定扫描的时候只需要包含哪些组件
//FilterType.ANNOTATION：按照注解
//FilterType.ASSIGNABLE_TYPE：按照给定的类型；
//FilterType.ASPECTJ：使用ASPECTJ表达式
//FilterType.REGEX：使用正则指定
//FilterType.CUSTOM：使用自定义规则

public class MainConfig {


    @Bean
    @SuppressWarnings(value = "unchecked")
    public Person person() {
        return new Person("lishi", 20);
    }


}
