package com.gatesma.test;

import com.gatesma.ext.ExtConfig;
import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Copyright (C), 2020
 * FileName: IOCTest_Ext
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/2/2 14:04
 * Description:
 */
public class IOCTest_Ext {

    @Test
    public void test01(){
；        AnnotationConfigApplicationContext applicationContext  = new AnnotationConfigApplicationContext(ExtConfig.class);


        //发布事件；
//        applicationContext.publishEvent(new ApplicationEvent(new String("我发布的时间")) {
//        });

        applicationContext.close();
    }

}
