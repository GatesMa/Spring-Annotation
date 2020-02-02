package com.gatesma.test;

import com.gatesma.tx.TXConfig;
import com.gatesma.tx.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Copyright (C), 2020
 * FileName: TestTX
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/2/2 11:17
 * Description:
 */
public class TestTX {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TXConfig.class);
        UserService userService = applicationContext.getBean(UserService.class);

        userService.insertUser();

        applicationContext.close();
    }


}
