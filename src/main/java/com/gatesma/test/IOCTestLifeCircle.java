package com.gatesma.test;

import com.gatesma.config.MainConfigOfLifeCycle;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Copyright (C), 2020
 * FileName: IOCTestLifeCircle
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/27 10:51
 * Description:
 */
public class IOCTestLifeCircle {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        Object car = applicationContext.getBean("car");
        System.out.println("容器创建完成...");

        //applicationContext.getBean("car");
        //关闭容器
        applicationContext.close();
    }

}
