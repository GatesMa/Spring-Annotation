package com.gatesma.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Copyright (C), 2020
 * FileName: UserService
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/2/2 11:08
 * Description:
 */

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;
    
    public void insertUser() {
        userDAO.insert();
        System.out.println("插入完成!");
    }
    
}
