package com.gatesma.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Copyright (C), 2020
 * FileName: MyBeanPostProcessor
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/27 11:18
 * Description:
 *    后置处理器：初始化前后进行处理工作
 *    将后置处理器加入到容器中
 */
@Component
public class MyBeanPostProcessor  implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessBeforeInitialization..."+s+"=>"+o);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        // TODO Auto-generated method stub
        System.out.println("postProcessAfterInitialization..."+s+"=>"+o);
        return o;
    }
}
