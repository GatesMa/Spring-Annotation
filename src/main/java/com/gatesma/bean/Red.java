package com.gatesma.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * Copyright (C), 2020
 * FileName: Red
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/26 17:22
 * Description:
 */
@Component
public class Red implements ApplicationContextAware, BeanNameAware, EmbeddedValueResolverAware {

    private ApplicationContext applicationContext;
    
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println(applicationContext);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("当前类的名字：" + name);
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
//        System.out.println("resolver" + resolver);
        String stringValue = resolver.resolveStringValue("你好：${os.name}");
        System.out.println(stringValue);
    }
}
