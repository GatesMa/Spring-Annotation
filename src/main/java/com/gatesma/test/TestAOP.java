package com.gatesma.test;

import com.gatesma.aop.MathCalculator;
import com.gatesma.config.MainConfigOfAOP;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Copyright (C), 2020
 * FileName: TestAOP
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/30 13:28
 * Description:
 */
public class TestAOP {


    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);

        //1、不要自己创建对象
//		MathCalculator mathCalculator = new MathCalculator();
//		mathCalculator.div(1, 1);
        MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);

        mathCalculator.div(1, 1);

        applicationContext.close();
    }

}
