package com.gatesma.dao;

import org.springframework.stereotype.Repository;

/**
 * Copyright (C), 2020
 * FileName: BookDao
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/23 16:20
 * Description:
 */
@Repository
public class BookDao {

    private String lable = "1";

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    @Override
    public String toString() {
        return "BookDao{" +
                "lable='" + lable + '\'' +
                '}';
    }
}
