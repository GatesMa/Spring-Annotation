package com.gatesma.test;

import com.gatesma.bean.Boss;
import com.gatesma.bean.Person;
import com.gatesma.config.MainConfigOfPropertyValues;
import com.gatesma.config.MainConifgOfAutowired;
import com.gatesma.dao.BookDao;
import com.gatesma.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.awt.print.Book;

/**
 * Copyright (C), 2020
 * FileName: ICOTest_AutoWired
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/28 12:17
 * Description:
 */
public class ICOTest_AutoWired {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConifgOfAutowired.class);

    @Test
    public void test01() {

//        printBeans(applicationContext);
//        System.out.println("================");

//        BookService bookService = applicationContext.getBean(BookService.class);
//        System.out.println(bookService);
//        BookDao bookDao = applicationContext.getBean(BookDao.class);
//        System.out.println(bookDao);

        Boss boss = (Boss) applicationContext.getBean("boss");
        System.out.println(boss);

        applicationContext.close();

    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext) {
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name : names) {
            System.out.println(name);
        }
    }

}
