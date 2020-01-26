package com.gatesma.config;

import com.gatesma.bean.Person;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * Copyright (C), 2020
 * FileName: MainConfig2
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/26 12:28
 * Description:
 */
@SuppressWarnings("ALL")
@Configuration
public class MainConfig2 {


    //默认单实例的
    //Scope注解标识bean的作用域
    /**
     * ConfigurableBeanFactory#SCOPE_PROTOTYPE
     * @see ConfigurableBeanFactory#SCOPE_SINGLETON
     * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST  request
     * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION	 sesssion
     * @return
     * @Scope:调整作用域
     * prototype：多实例的：ioc容器启动并不会去调用方法创建对象放在容器中。
     * 					每次获取的时候才会调用方法创建对象；
     * singleton：单实例的（默认值）：ioc容器启动会调用方法创建对象放到ioc容器中。
     * 			以后每次获取就是直接从容器（map.get()）中拿，
     * request：同一次请求创建一个实例
     * session：同一个session创建一个实例
     *
     */
    /**
     * 懒加载：
     * 		针对单实例bean（Prototype类型默认懒加载）：默认在容器启动的时候创建对象；
     * 		懒加载：容器启动不创建对象。第一次使用(获取)Bean创建对象，并初始化；
     * @return
     */
    @Scope("prototype")
    @Lazy
    @Bean("person")
    public Person person() {
        System.out.println("添加Person对象");
        return new Person("zhangsan", 19);
    }


}
