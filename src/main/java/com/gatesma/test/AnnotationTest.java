package com.gatesma.test;

import com.gatesma.config.MainConfig;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;

/**
 * Copyright (C), 2020
 * FileName: AnnotationTest
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/25 19:10
 * Description:
 */
public class AnnotationTest {


    /**
     * 元注解：
     * Retention：生命周期：SOURCE、CLASS、RUNTIME，只有声明为RUNTIME才可以使用反射获取
     *      SuppressWarning是SOURCE
     * Target：指定修饰的注解可以修饰哪些元素：TYPE、FIELD、PARAMETER...
     *
     * - 如果我们自定义注解，通常需要写这两个元注解
     *
     * --------------
     * 不常用：
     * Document:被javadoc提取成文档，默认是不包含注解的
     *
     * Inherited：子类是否继承父类的注解
     *
     * （通过反射获取注解信息 ）
     */

    @Test
    public void test01() {
        Class clazz = MainConfig.class;
        Annotation[] annotations = clazz.getAnnotations();
        for(Annotation annotation : annotations) {
            System.out.println(annotation );
        }
    }

}
