package com.gatesma.controller;

import com.gatesma.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Copyright (C), 2020
 * FileName: BookController
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/23 16:20
 * Description:
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

}
