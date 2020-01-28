package com.gatesma.service;

import com.gatesma.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Copyright (C), 2020
 * FileName: BookService
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/23 16:20
 * Description:
 */
@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public void print() {
        System.out.println(bookDao);
    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
}
