package com.gatesma.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * Copyright (C), 2020
 * FileName: ColorFactoryBean
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/26 17:42
 * Description:
 */
//创建一个Spring定义的工厂Bean
public class ColorFactoryBean implements FactoryBean<Color> {


    @Override
    public Color getObject() throws Exception {
        System.out.println("ColorFactoryBean...getObject...");

        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    //是单例？
    //true：这个bean是单实例，在容器中保存一份
    //false：多实例，每次获取都会创建一个新的bean；
    @Override
    public boolean isSingleton() {
        return true;
    }
}
