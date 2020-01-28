package com.gatesma.bean;

/**
 * Copyright (C), 2020
 * FileName: Color
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/26 17:18
 * Description:
 */
public class Color {

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Color [car=" + car + "]";
    }



}
